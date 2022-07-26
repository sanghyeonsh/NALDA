package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class MealStock {
    @Id
    @GeneratedValue
    @Column(name = "meal_stock_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "meal_id")
    private Meal meal;

    private int total;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "flight_id")
    private Flight flight;

}
