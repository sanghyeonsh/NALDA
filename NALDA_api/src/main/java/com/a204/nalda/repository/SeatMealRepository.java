package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.airplane.SeatMeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeatMealRepository extends JpaRepository<SeatMeal,Long> {

    @Query("select s from SeatMeal s where s.flight.id=:flightId order by substring(s.seat.seatNum,2,2),s.seat.seatNum")
    List<SeatMeal> findByFlightId(Long flightId);
}
