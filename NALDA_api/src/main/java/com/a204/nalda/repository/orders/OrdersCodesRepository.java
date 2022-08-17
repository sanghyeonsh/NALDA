package com.a204.nalda.repository.orders;

import com.a204.nalda.domain.entity.inflightservice.OrdersCodes;
import com.a204.nalda.dto.orders.OrderListDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrdersCodesRepository extends JpaRepository<OrdersCodes, Long> {

    @Query("select c from OrdersCodes c join fetch c.orders o  inner join Flight f on o.flight.id = f.id where f.flightNum = :flightNum and f.status = 'PROGRESS'")
    List<OrdersCodes> findByFlightNum(@Param("flightNum") String flightNum);
}
