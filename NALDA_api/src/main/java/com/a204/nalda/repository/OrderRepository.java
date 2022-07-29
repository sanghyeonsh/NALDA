package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.inflightservice.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orders, Long> {



}
