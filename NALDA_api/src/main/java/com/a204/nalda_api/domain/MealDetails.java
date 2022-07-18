package com.a204.nalda_api.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class MealDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meal_id")
    private Meal meal;

    @Column(name = "meal_name")
    private String mealName;
}
