package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.airplane.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface SeatRepository extends JpaRepository<Seat,Long> {

    Seat findTopBySeatNum(String seatNum);

    @Query("select s from Seat s join fetch s.airplane a where s.airplane.id = a.id and s.ip = :ip")
    Optional<Seat> findByIp(@Param("ip") String ip);
}
