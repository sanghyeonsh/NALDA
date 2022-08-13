package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.airplane.Flight;
import com.a204.nalda.domain.entity.inflightservice.ServiceStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ServiceStockRepository extends JpaRepository<ServiceStock, Long> {


    @Query("select s from ServiceStock s where s.flight.id=:flightId and s.serviceCodes.id=:serviceCodeId")
    ServiceStock findByFlightAndServiceCode(Long flightId, Long serviceCodeId);

    @Query("select s from ServiceStock s where s.flight.id=(select f.id from Flight f where f.flightNum=:flightNum)")
    List<ServiceStock> findByFlightNum(String flightNum);


}
