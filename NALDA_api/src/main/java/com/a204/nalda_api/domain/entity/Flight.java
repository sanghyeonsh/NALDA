package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.time.LocalDateTime;

import static javax.persistence.FetchType.LAZY;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Flight {

    @Id
    @GeneratedValue
    @Column(name = "flight_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "seat_id")
    private Seat seat;

    @Column(name = "flight_date")
    private LocalDateTime flightDate;

}
