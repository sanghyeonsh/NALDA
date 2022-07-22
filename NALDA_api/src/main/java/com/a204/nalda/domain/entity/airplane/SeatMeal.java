package com.a204.nalda.domain.entity.airplane;

import com.a204.nalda.domain.entity.inflightservice.Meal;
import com.a204.nalda.domain.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class SeatMeal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_meal_id")
    private Long id;

    @Column(name = "meal_classification")
    private String mealClassification;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "meal_id")
    private Meal meal;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "seat_id")
    private Seat seat;

}
