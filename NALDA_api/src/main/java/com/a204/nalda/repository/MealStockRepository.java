package com.a204.nalda.repository;

import com.a204.nalda.domain.entity.inflightservice.MealStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.core.parameters.P;

import java.util.List;

public interface MealStockRepository extends JpaRepository<MealStock,Long> {

//    승무원에게 보여주는 페이지
//    @Query("select m.imageName, m.mealMenu, s.total, m.content from MealStock s inner join fetch Meal m on s.flight.id = :flightId where s.status='PROGRESS'")
//    List<MealStock> findByFlightId(@Param("flightId") Long flightId);

    @Query("select s from MealStock s where s.flight.id=(select f.id from Flight f where f.flightNum=:flightNum and f.status='PROGRESS')")
    List<MealStock> findByFlightNum(@Param("flightNum") String flightNum);

    @Query("select s from MealStock s where s.flight.id=(select f.id from Flight f where f.flightNum=:flightNum and f.status='PROGRESS') and s.meal.id=:mealId")
    MealStock findByFlightNumAndMealId(@Param("flightNum") String flightNum, @Param("mealId") Long mealId);


}
