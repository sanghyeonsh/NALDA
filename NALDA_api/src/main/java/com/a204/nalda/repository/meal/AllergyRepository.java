package com.a204.nalda.repository.meal;

import com.a204.nalda.domain.entity.inflightservice.Allergy;
import com.a204.nalda.domain.entity.inflightservice.MealDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AllergyRepository extends JpaRepository<Allergy, Long> {

    @Query("select a from Allergy a inner join fetch Meal m on m.id = a.meal.id where m.id = :mealId")
    List<Allergy> findByMeal(@Param("mealId") Long mealId);


}
