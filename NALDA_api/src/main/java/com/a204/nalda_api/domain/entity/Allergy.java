package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Allergy {

    @Id
    @GeneratedValue
    @Column(name = "allergy_id")
    private Long id;

    @Column(name = "allergy_type")
    private String allergyType;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "meal_id")
    private Meal meal;

    public void changeMeal( Meal meal) {
        this.meal = meal;
    }
}
