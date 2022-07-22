package com.a204.nalda.domain.entity.inflightservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Allergy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
