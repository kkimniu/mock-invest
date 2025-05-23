package io.cavia.mockinvest.client;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class IntegrationClientTest {

    @Autowired
    ApiOAuthManager apiOAuthManager;
    @Autowired
    RestWebClient restWebClient;
    @Autowired
    ApiWebSocketClient webSocketClient;

    @Test
    void getToken() {
        System.out.println(apiOAuthManager.getAccessToken());
    }

    @Test
    void getKey() {
        System.out.println(apiOAuthManager.getApprovalKey());
    }

    @Test
    void searchStockInfo() {
        System.out.println(restWebClient.searchStockInfo("005930"));//삼성전자
    }

    @Test
    void webSocketConnection() throws InterruptedException {
        webSocketClient.connectToWebSocket();
        Thread.sleep(1000);
        webSocketClient.subscribeWebSocket("005930", ApiWebSocketClient.TR_ID_EXECUTION_PRICE);
        webSocketClient.subscribeWebSocket("005930", ApiWebSocketClient.TR_ID_QUOTED_PRICE);
        Thread.sleep(20 * 1000);
        webSocketClient.unsubscribeWebSocket("005930", ApiWebSocketClient.TR_ID_EXECUTION_PRICE);
        webSocketClient.unsubscribeWebSocket("005930", ApiWebSocketClient.TR_ID_QUOTED_PRICE);
        Thread.sleep(1000);
        webSocketClient.disconnect();
    }
}
