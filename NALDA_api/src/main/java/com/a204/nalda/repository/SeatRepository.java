package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.airplane.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat,Long> {

    Seat findTopBySeatNum(String seatNum);

}
