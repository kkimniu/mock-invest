package io.cavia.mockinvest.client;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Map;

public class ApiWebSocketHandler extends TextWebSocketHandler {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        // 웹소켓 연결 성공 시 호출됩니다.
        System.out.println("웹소켓 서버에 성공적으로 연결되었습니다. 세션 ID: " + session.getId());
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        // 서버로부터 텍스트 메시지(예: JSON 형태의 체결가 데이터)를 수신했을 때 호출됩니다.
        String receivedData = message.getPayload();
        System.out.println("서버로부터 메시지 수신: " + receivedData);

        JsonNode rootNode = objectMapper.readTree(receivedData);
        JsonNode headerNode = rootNode.path("header");
        String trId = "";

        if (!headerNode.isMissingNode()) { // "header" 필드가 존재하는지 확인
            trId = headerNode.path("tr_id").asText(); // "tr_id" 값을 텍스트로 가져옵니다. 없으면 빈 문자열.
            System.out.println("추출된 tr_id: " + trId);
            if ("PINGPONG".equals(trId)) {
                session.sendMessage(new TextMessage("pong"));
            }
            return;
        }

        // TODO 받아온 receivedData 문자열을 분류해서 DB에 저장하는 코드 작성

    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        // 전송 오류 발생 시 호출됩니다.
        System.err.println("웹소켓 전송 오류 발생: " + exception.getMessage());
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        // 웹소켓 연결 종료 시 호출됩니다.
        System.out.println("웹소켓 연결이 종료되었습니다. 세션 ID: " + session.getId() + ", 상태: " + status);
    }
}
