package com.a204.nalda_api.domain.entity;

import com.a204.nalda_api.domain.enumtype.SeatClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Seat {
    @Id
    @GeneratedValue
    @Column(name = "seat_id")
    private Long id;

    @Column(name = "seat_num")
    private String seatNum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @Enumerated(EnumType.STRING)
    private SeatClass seatClass;

}
