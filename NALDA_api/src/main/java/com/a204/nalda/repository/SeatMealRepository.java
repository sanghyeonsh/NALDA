package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.airplane.SeatMeal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatMealRepository extends JpaRepository<SeatMeal,Long> {

    List<SeatMeal> findByFlightId(Long flightId);
}
