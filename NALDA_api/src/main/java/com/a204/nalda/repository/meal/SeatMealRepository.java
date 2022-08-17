package com.a204.nalda.repository.meal;

import com.a204.nalda.domain.entity.airplane.SeatMeal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SeatMealRepository extends JpaRepository<SeatMeal,Long> {

    @Query("select s from SeatMeal s where s.flight.id=(select f.id from Flight f where f.flightNum = :flightNum) and s.status = 'PROGRESS' order by substring(s.seat.seatNum,2,2),s.seat.seatNum")
    List<SeatMeal> findByFlightNum(String flightNum);

    @Query("select m from SeatMeal m where m.seat.id=(select s.id from Seat s where s.seatNum=:seatNum) and m.status='PROGRESS'")
    SeatMeal findBySeatNum(String seatNum);
}
