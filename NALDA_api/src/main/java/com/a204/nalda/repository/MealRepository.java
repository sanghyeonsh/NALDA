package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.inflightservice.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface MealRepository extends JpaRepository<Meal,Long> {

    @Query("select m from Meal m inner join fetch MealStock s on m.id = s.meal.id where s.flight.id = :flightId")
    List<Meal> findByFlightId(@Param("flightId") Long flightId);

    Meal findTopByMealMenu(String mealMenu);


}
