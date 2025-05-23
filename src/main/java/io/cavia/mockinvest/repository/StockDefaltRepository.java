package io.cavia.mockinvest.repository;

import io.cavia.mockinvest.domain.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockDefaltRepository extends JpaRepository<Stock, String> {
}
