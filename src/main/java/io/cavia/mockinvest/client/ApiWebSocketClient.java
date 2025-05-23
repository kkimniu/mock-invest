package io.cavia.mockinvest.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.client.WebSocketClient;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ApiWebSocketClient {

    private final WebSocketClient webSocketClient;
    private final WebSocketHandler webSocketHandler;
    private WebSocketSession currentSession;
    private final ApiOAuthManager apiOAuthManager;

    public static final String TR_ID_EXECUTION_PRICE = "H0STCNT0";
    public static final String TR_ID_QUOTED_PRICE = "H0STASP0";
    public static final String TR_TYPE_SUBSCRIPTION = "1";
    public static final String TR_TYPE_UNSUBSCRIPTION = "2";

    public ApiWebSocketClient(WebSocketClient webSocketClient, WebSocketHandler webSocketHandler, ApiOAuthManager apiOAuthManager) {
        this.webSocketClient = webSocketClient;
        this.webSocketHandler = webSocketHandler;
        this.apiOAuthManager = apiOAuthManager;
    }

    /**
     * API 웹소켓에 연결
     */
    public void connectToWebSocket() {
        try {
            String STOCK_WEBSOCKET_URI = "ws://ops.koreainvestment.com:31000";
            CompletableFuture<WebSocketSession> completableFutureSession = webSocketClient.execute(webSocketHandler, STOCK_WEBSOCKET_URI);

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

    /**
     * API 웹소켓 연결 해제
     */
    public void disconnect() {
        if (currentSession != null && currentSession.isOpen()) {
            try {
                currentSession.close();
            } catch (IOException e) {
                System.err.println("SFW5 WebSocket 연결 해제 중 오류: " + e.getMessage());
            }
        }
    }

    /**
     * 연결된 웹소켓 세션으로 메시지를 전송함. 연결되어 있지 않으면 오류메시지 출력
     *
     * @param message API로 전송할 문자열
     */
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

    /**
     * 연결된 웹소켓 세션으로 구독 요청함
     *
     * @param trKey 주식 고유 번호
     * @param trId  웹소켓 API ID
     */
    public void subscribeWebSocket(String trKey, String trId) {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> requestMap = buildSubscriptionRequest(apiOAuthManager.getApprovalKey(),
                TR_TYPE_SUBSCRIPTION, trKey, trId);

        try {
            String jsonMessage = objectMapper.writeValueAsString(requestMap);
            sendMessage(jsonMessage);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("JSON 문자열 변환 중 오류 발생: " + e.getMessage(), e);
        }
    }

    /**
     * 연결된 웹소센 세션으로 구독 해지 요청함
     *
     * @param trKey 주식 고유 번호
     * @param trId  웹소켓 API ID
     */
    public void unsubscribeWebSocket(String trKey, String trId) {
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> requestMap = buildSubscriptionRequest(apiOAuthManager.getApprovalKey(),
                TR_TYPE_UNSUBSCRIPTION, trKey, trId);

        try {
            String jsonMessage = objectMapper.writeValueAsString(requestMap);
            sendMessage(jsonMessage);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("JSON 문자열 변환 중 오류 발생: " + e.getMessage(), e);
        }
    }

    private Map<String, Object> buildSubscriptionRequest(String approvalKey, String trType, String trKey, String trId) {
        Map<String, Object> requestMap = new HashMap<>();
        // header 객체 구성
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put("approval_key", approvalKey);
        headerMap.put("custtype", "P");
        headerMap.put("tr_type", trType);
        headerMap.put("content-type", "utf-8");
        requestMap.put("header", headerMap);
        // body 객체 구성
        Map<String, Object> bodyMap = new HashMap<>();
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("tr_id", trId);
        inputMap.put("tr_key", trKey);
        bodyMap.put("input", inputMap);
        requestMap.put("body", bodyMap);

        return requestMap;
    }

}
