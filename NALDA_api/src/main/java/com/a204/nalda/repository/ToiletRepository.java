package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.inflightservice.ToiletLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ToiletRepository extends JpaRepository<ToiletLog, Long> {

    @Query("select l from ToiletLog l join fetch Toilet t on l.toilet.id = t.id inner join Airplane a on t.airplane.id = a.id where a.airplaneKind = :airplaneKind order by l.time desc ")
    List<ToiletLog> findByAirplaneKind(@Param("airplaneKind") String airplaneKind);

}
