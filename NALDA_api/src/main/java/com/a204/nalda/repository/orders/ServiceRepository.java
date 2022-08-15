package com.a204.nalda.repository.orders;

import com.a204.nalda.domain.entity.inflightservice.ServiceCodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ServiceRepository extends JpaRepository<ServiceCodes, Long> {

    @Query("select s from ServiceCodes s where s.serviceClass = :serviceClass")
    List<ServiceCodes> findByServiceClass(@Param("serviceClass") String serviceClass);

    @Query("select s from ServiceCodes s where s.code=:serviceCode")
    ServiceCodes findByServiceCode(@Param("serviceCode") String serviceCode);

    @Query("select c from ServiceCodes c inner join fetch ServiceStock s on c.id = s.serviceCodes.id where s.id=:stockId")
    ServiceCodes findByServiceStockId(@Param("stockId") Long stockId);
}
