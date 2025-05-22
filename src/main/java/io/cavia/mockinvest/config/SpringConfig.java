package io.cavia.mockinvest.config;

import io.cavia.mockinvest.mapper.KorOrderRealTimeMapper;
import io.cavia.mockinvest.mapper.KorStockRealTimeMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public KorStockRealTimeMapper korStockRealTimeMapper() {
        return new KorStockRealTimeMapper();
    }

    @Bean
    public KorOrderRealTimeMapper korOrderRealTimeMapper() {
        return new KorOrderRealTimeMapper();
    }

}
