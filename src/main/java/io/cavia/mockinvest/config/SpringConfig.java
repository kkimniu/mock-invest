package io.cavia.mockinvest.config;

import io.cavia.mockinvest.dto.response.KorStockRealTimeDto;
import io.cavia.mockinvest.mapper.KorOrderRealTimeMapper;
import io.cavia.mockinvest.mapper.KorStockRealTimeMapper;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {


    @Bean
    public KorStockRealTimeMapper korStockRealTimeMapper() {
        return Mappers.getMapper(KorStockRealTimeMapper.class);
    }

    @Bean
    public KorOrderRealTimeMapper korOrderRealTimeMapper() {
        return Mappers.getMapper(KorOrderRealTimeMapper.class);
    }

}
