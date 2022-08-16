package com.a204.nalda.repository.meal;

import com.a204.nalda.domain.entity.inflightservice.MealDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MealDetailRepository extends JpaRepository<MealDetail, Long> {

    @Query("select d from MealDetail d inner join fetch Meal m on m.id = d.meal.id where m.id = :mealId")
    List<MealDetail> findByMeal(@Param("mealId") Long mealId);

}
