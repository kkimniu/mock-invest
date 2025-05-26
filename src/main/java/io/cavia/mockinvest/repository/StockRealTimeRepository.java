package io.cavia.mockinvest.repository;

import io.cavia.mockinvest.domain.StockRealTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface StockRealTimeRepository extends JpaRepository<StockRealTime, String> {
}
