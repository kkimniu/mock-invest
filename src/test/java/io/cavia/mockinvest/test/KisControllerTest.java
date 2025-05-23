package io.cavia.mockinvest.test;

import io.cavia.mockinvest.client.ApiOAuthManager;
import io.cavia.mockinvest.client.ApiWebSocketClient;
import io.cavia.mockinvest.client.RestWebClient;
import io.cavia.mockinvest.controller.KisController;
import io.cavia.mockinvest.mapper.KorStock067Mapper;
import io.cavia.mockinvest.mapper.KorStockRealTimeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class KisControllerTest {

    @Autowired
    private KisController kisController;

    @Autowired
    private KorStockRealTimeMapper korStockRealTimeMapper;

    @Autowired
    private ApiWebSocketClient webSocketClient;

    @Test
    public void showDefaultInfo() {
        kisController.showDefaultInfo();
    }

    @Test
    public void searchStockRealTimeInfo() {
        String testStr = "0|H0STASP0|001|005930^121548^0^54700^54800^54900^55000^55100^55200^55300^55400^55500^55600^54600^54500^54400^54300^54200^54100^54000^53900^53800^53700^450808^101405^52096^74754^91020^91697^36988^71958^65876^44519^131108^415316^215834^176158^181603^170706^244750^119061^147291^135586^1081121^1937413^0^0^0^0^289564^-54700^5^-100.00^4879902^-1^-19^0^0^0";
        System.out.println(korStockRealTimeMapper.toEntity(testStr));

    }

}
