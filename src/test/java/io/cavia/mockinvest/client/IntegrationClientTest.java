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

    @Test
    void getToken() {
        System.out.println(apiOAuthManager.getAccessToken());
    }

    @Test
    void getKey(){
        System.out.println(apiOAuthManager.getApprovalKey());
    }

    @Test
    void searchStockInfo(){
        System.out.println(restWebClient.searchStockInfo("005930"));//삼성전자
    }
}
