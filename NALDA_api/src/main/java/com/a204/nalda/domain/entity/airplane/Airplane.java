package com.a204.nalda.domain.entity.airplane;

import com.a204.nalda.domain.entity.inflightservice.Toilet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airplane_id")
    private Long id;

    @Column(name = "passenger_num")
    private int passengerNum;

    @Column(name = "airplane_kind")
    private String airplaneKind;

    private String image;

    @OneToMany(mappedBy = "airplane")
    private List<Toilet> toilets = new ArrayList<>();

    public void addToilet(Toilet toilet) {
        toilets.add(toilet);
        toilet.changeAirplane(this);
    }
}
