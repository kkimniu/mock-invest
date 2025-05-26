package io.cavia.mockinvest.repository;

import io.cavia.mockinvest.domain.OrderRealTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRealTimeRepository extends JpaRepository<OrderRealTime, String> {
}
