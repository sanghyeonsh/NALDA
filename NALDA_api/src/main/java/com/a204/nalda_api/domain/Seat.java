package com.a204.nalda_api.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private Long Id;

    @Column(name = "seat_num")
    private String seatNum;

    @OneToOne(mappedBy = "seat",fetch = FetchType.LAZY)
    private Meal meal;

}
