package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.inflightservice.MealStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MealStockRepository extends JpaRepository<MealStock,Long> {

//    승무원에게 보여주는 페이지
//    @Query("select m.imageName, m.mealMenu, s.total from MealStock s inner join fetch Meal m on s.flight.id = :flightId")
//    List<MealStock> findByFlight(@Param("flightId") Long flightId);

//    @Query("select  from MealStock")
//    MealStock findMealStockByFlightAndMeal(@Param("flightId") Long flightId, @Param("mealId") Long mealId);



}
