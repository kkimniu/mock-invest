package io.cavia.mockinvest.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketClient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

@Service
public class ApiWebSocketClient {

    private final WebSocketClient webSocketClient;
    private final WebSocketHandler webSocketHandler;
    private WebSocketSession currentSession;
    private final ApiOAuthManager apiOAuthManager;

    public ApiWebSocketClient(WebSocketClient webSocketClient, WebSocketHandler webSocketHandler, ApiOAuthManager apiOAuthManager) {
        this.webSocketClient = webSocketClient;
        this.webSocketHandler = webSocketHandler;
        this.apiOAuthManager = apiOAuthManager;
    }

    public void connectToWebSocket() {
        try {
            String STOCK_WEBSOCKET_URI = "ws://ops.koreainvestment.com:31000";
            CompletableFuture<WebSocketSession> completableFutureSession =
                    webSocketClient.execute(webSocketHandler, STOCK_WEBSOCKET_URI);

            completableFutureSession.whenComplete((session, ex) -> {
                if (ex != null) {
                    System.err.println("웹소켓 연결 실패 (CompletableFuture): " + ex.getMessage());
                } else {
                    this.currentSession = session;
                    System.out.println("비동기 연결 성공 (CompletableFuture). 세션: " + session.getId());
                }
            });
        } catch (Exception e) {
            System.err.println("웹소켓 연결 설정 중 예외 발생: " + e.getMessage());
        }
    }

    public void disconnect() {
        if (currentSession != null && currentSession.isOpen()) {
            try {
                currentSession.close();
            } catch (IOException e) {
                System.err.println("SFW5 WebSocket 연결 해제 중 오류: " + e.getMessage());
            }
        }
    }

    // 웹소켓 서버로 메시지를 보내는 예시 메서드
    private void sendMessage(String message) {
        if (currentSession != null && currentSession.isOpen()) {
            try {
                System.out.println("서버로 메시지 전송: " + message);
                currentSession.sendMessage(new TextMessage(message));
            } catch (IOException e) {
                System.err.println("메시지 전송 중 오류 발생: " + e.getMessage());
            }
        } else {
            System.err.println("웹소켓이 연결되어 있지 않아 메시지를 보낼 수 없습니다.");
        }
    }

    public void subscribeWebSocket(String trKey, String trId) {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> messageMap = new HashMap<>();

        // header 객체 구성
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("approval_key", apiOAuthManager.getApprovalKey());
        headerMap.put("custtype", "P");
        headerMap.put("tr_type", "1");
        headerMap.put("content-type", "utf-8");
        messageMap.put("header", headerMap);

        // body 객체 구성
        Map<String, Object> bodyMap = new HashMap<>();
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("tr_id", trId);
        inputMap.put("tr_key", trKey);
        bodyMap.put("input", inputMap);
        messageMap.put("body", bodyMap);

        try {
            String jsonMessage = objectMapper.writeValueAsString(messageMap);
            sendMessage(jsonMessage);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("JSON 문자열 변환 중 오류 발생: " + e.getMessage(), e);
        }
    }

}
