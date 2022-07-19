package com.a204.nalda_api.domain.entity;

import com.a204.nalda_api.domain.embedded.TravelPeriod;
import com.a204.nalda_api.domain.enumtype.Permission;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomsDeclaration {
    @Id
    @GeneratedValue
    @Column(name = "customs_declaration_id")
    private Long id;

    @Embedded
    private TravelPeriod travelPeriod;
    private String purposeTravel;
    private String flightNum;
    private int accompany;
    @Enumerated(EnumType.STRING)
    private Permission dutyfreeExceed;

}
