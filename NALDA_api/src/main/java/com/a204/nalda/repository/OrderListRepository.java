package com.a204.nalda.repository;


import com.a204.nalda.domain.entity.inflightservice.OrdersCodes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderListRepository extends JpaRepository<OrdersCodes, Long> {
}
