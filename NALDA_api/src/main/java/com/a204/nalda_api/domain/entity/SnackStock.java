package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SnackStock {

    @Id
    @GeneratedValue
    @Column(name = "snackstock_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "flight_id")
    private Flight flight;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "snack_id")
    private Snack snack;

    private int total;

}
