package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Toilet {
    @Id
    @GeneratedValue
    @Column(name = "toilet_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "airplane_id")
    private Airplane airplane;

    @Column(name = "toilet_code")
    private String toiletCode;

    public void changeAirplane(Airplane airplane) {
        this.airplane = airplane;
    }
}
