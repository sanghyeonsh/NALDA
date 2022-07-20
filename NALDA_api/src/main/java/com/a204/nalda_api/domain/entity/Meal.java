package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Meal {

    @Id
    @GeneratedValue
    @Column(name = "meal_id")
    private Long id;

    @Column(name = "meal_country")
    private String mealCountry;

    @Column(name = "meal_menu")
    private String mealMenu;

    private int calories;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @Column(name = "image_name")
    private String imageName;

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Allergy> allergies = new ArrayList<>();

    @OneToMany(mappedBy = "meal", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MealDetail> mealDetails = new ArrayList<>();

    public void addAllergy(Allergy allergy) {
        allergies.add(allergy);
        allergy.changeMeal(this);
    }

    public void addMealDetails(MealDetail mealDetail) {
        mealDetails.add(mealDetail);
        mealDetail.changeMeal(this);
    }
}
