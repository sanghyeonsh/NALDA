package com.a204.nalda_api.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meal_id")
    private Long Id;

    @OneToOne(fetch = FetchType.LAZY, cascade =CascadeType.ALL)
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @Column(name = "meal_country")
    private String mealCountry;

    @Column(name = "meal_menu")
    private String mealMenu;

    private int calories;

    @OneToMany(mappedBy = "meal",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MealDetails> mealDetailsList = new ArrayList<>();

    //연관관계 메소드
    public void addMealDetails(MealDetails mealDetails) {
        this.mealDetailsList.add(mealDetails);
        mealDetails.setMeal(this);
    }
}
