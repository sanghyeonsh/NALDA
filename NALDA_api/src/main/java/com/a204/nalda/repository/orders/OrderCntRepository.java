package com.a204.nalda.repository.orders;

import com.a204.nalda.domain.entity.inflightservice.OrdersCodes;
import com.a204.nalda.dto.orders.OrderCntDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderCntRepository extends JpaRepository<OrdersCodes,Long> {
//sum(c.cnt)
    @Query("select new com.a204.nalda.dto.orders.OrderCntDto(c.orderCode,sum(c.cnt)) from OrdersCodes c where c.orders.id in (select o.id from Orders o where o.flight.id=(select f.id from Flight f where f.flightNum=:flightNum and f.status='PROGRESS')) group by c.orderCode")
    List<OrderCntDto> findbyFlightNumAndOrderCode(@Param("flightNum") String flightNum);

}
