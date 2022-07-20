package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Airplane {
    @Id
    @GeneratedValue
    @Column(name = "airplane_id")
    private Long id;

    @Column(name = "passenger_num")
    private int passengerNum;

    @Column(name = "airplane_kind")
    private String airplaneKind;

    @OneToMany(mappedBy = "airplane")
    private List<Toilet> toilets = new ArrayList<>();

    public void addToilet(Toilet toilet) {
        toilets.add(toilet);
        toilet.changeAirplane(this);
    }
}
