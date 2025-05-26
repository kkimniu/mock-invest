package io.cavia.mockinvest.test;

import io.cavia.mockinvest.client.ApiWebSocketClient;
import io.cavia.mockinvest.client.RestWebClient;
import io.cavia.mockinvest.controller.KisController;
import io.cavia.mockinvest.domain.OrderRealTime;
import io.cavia.mockinvest.domain.Stock;
import io.cavia.mockinvest.domain.StockRealTime;
import io.cavia.mockinvest.mapper.KorOrderRealTimeMapper;
import io.cavia.mockinvest.mapper.KorStock067Mapper;
import io.cavia.mockinvest.mapper.KorStockRealTimeMapper;
import io.cavia.mockinvest.repository.OrderRealTimeRepository;
import io.cavia.mockinvest.repository.StockDefaltRepository;
import io.cavia.mockinvest.repository.StockRealTimeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.BufferedReader;
import java.io.FileReader;

@SpringBootTest
public class KisControllerTest {

    @Autowired
    private KisController kisController;

    @Autowired
    private KorStockRealTimeMapper korStockRealTimeMapper;

    @Autowired
    private KorOrderRealTimeMapper korOrderRealTimeMapper;

    @Autowired
    private RestWebClient restWebClient;

    @Autowired
    private KorStock067Mapper korStock067Mapper;

    @Autowired
    private ApiWebSocketClient webSocketClient;

    @Autowired
    private StockDefaltRepository stockDefaltRepository;

    @Autowired
    private StockRealTimeRepository stockRealTimeRepository;

    @Autowired
    private OrderRealTimeRepository orderRealTimeRepository;


    @Test
    public void showStocksInfo() {
        String stockCode = "196170, 247540, 028300, 086520, 277810, 087010, 214450, 145020, 141080, 214150, 298380, 000250, 058470, 041510, 035900, 257720, 263750, 068760, 310210";
        String[] Codes = stockCode.split(", ");

        for (String code : Codes) {
            Stock stock = korStock067Mapper.toStock(restWebClient.searchStockInfo067(code).getOutput());
            stockDefaltRepository.save(korStock067Mapper.toStock(restWebClient.searchStockInfo046(code).getOutput().get(0), stock));
        }
    }

    @Test
    void webSocketConnection() throws InterruptedException {
        String stockCode = "196170, 247540, 028300, 086520, 277810, 087010, 214450, 145020, 141080, 214150, 298380, 000250, 058470, 041510, 035900, 257720, 263750, 068760, 310210";
        String[] Codes = stockCode.split(", ");
        webSocketClient.connectToWebSocket();
        Thread.sleep(1000);
        for (String code : Codes){
            webSocketClient.subscribeWebSocket(code, ApiWebSocketClient.TR_ID_EXECUTION_PRICE);
            webSocketClient.subscribeWebSocket(code, ApiWebSocketClient.TR_ID_QUOTED_PRICE);
        }
        Thread.sleep(100 * 1000);
        for (String code : Codes){
            webSocketClient.unsubscribeWebSocket(code, ApiWebSocketClient.TR_ID_EXECUTION_PRICE);
            webSocketClient.unsubscribeWebSocket(code, ApiWebSocketClient.TR_ID_QUOTED_PRICE);
        }
        Thread.sleep(1000);
        webSocketClient.disconnect();
    }

}
