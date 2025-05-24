package io.cavia.mockinvest.mapper;

import io.cavia.mockinvest.domain.Stock;
import io.cavia.mockinvest.dto.response.StockDtoOutput;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface KorStock067Mapper {
    /**
     * 스프링이 구현체를 자동생성해서 주입해줍니다
     * @param output
     * @return
     */
    Stock toStock(StockDtoOutput output);

    Stock toStock(StockDtoOutput output, @MappingTarget Stock stock);
}
