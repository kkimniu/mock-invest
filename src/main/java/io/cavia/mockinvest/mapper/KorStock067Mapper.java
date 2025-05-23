package io.cavia.mockinvest.mapper;

import io.cavia.mockinvest.domain.Stock;
import io.cavia.mockinvest.dto.response.KorStock067Output;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface KorStock067Mapper {
    /**
     * 스프링이 구현체를 자동생성해서 주입해줍니다
     * @param output
     * @return
     */
    Stock toStock(KorStock067Output output);
}
