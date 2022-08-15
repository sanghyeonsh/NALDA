package com.a204.nalda.repository.meal;

import com.a204.nalda.domain.entity.inflightservice.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface MealRepository extends JpaRepository<Meal,Long> {

    @Query("select m from Meal m join fetch MealStock s on m.id = s.meal.id where s.flight.id = (select f.id from Flight f where f.flightNum = :flightNum and f.status = 'PROGRESS')")
    List<Meal> findByFlightNum(@Param("flightNum") String flightNum);

    Meal findTopByMealMenu(String mealMenu);


}
