package com.a204.nalda.repository.orders;


import com.a204.nalda.domain.entity.inflightservice.OrdersCodes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderListRepository extends JpaRepository<OrdersCodes, Long> {


    List<OrdersCodes> findByOrdersId(Long ordersId);
}
