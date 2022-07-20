package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MealDetail {
    @Id
    @GeneratedValue
    @Column(name = "meal_detail_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "meal_id")
    private Meal meal;

    @Column(name = "meal_name")
    private String mealName;

    public void changeMeal(Meal meal) {
        this.meal = meal;
    }
}
