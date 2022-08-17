package com.a204.nalda.domain.entity.inflightservice;

import com.a204.nalda.domain.entity.airplane.Airplane;
import com.a204.nalda.domain.enumtype.SeatClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Meal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Enumerated(EnumType.STRING)
    @Column(name = "seat_class")
    private SeatClass seatClass;

    private String content;

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
