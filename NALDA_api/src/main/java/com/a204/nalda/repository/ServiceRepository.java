package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.inflightservice.ServiceCodes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ServiceRepository extends JpaRepository<ServiceCodes, Long> {

    @Query("select s from ServiceCodes s where s.serviceClass = :serviceClass")
    List<ServiceCodes> findByServiceClass(@Param("serviceClass") String serviceClass);

}
