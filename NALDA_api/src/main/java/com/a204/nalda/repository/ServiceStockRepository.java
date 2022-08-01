package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.inflightservice.ServiceStock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceStockRepository extends JpaRepository<ServiceStock, Long> {
}
