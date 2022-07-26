package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class VisitedCountry {
    @Id
    @GeneratedValue
    @Column(name = "visited_country_id")
    private Long id;

    @Column(name = "country_name")
    private String countryName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customs_declaraition_id")
    private CustomsDeclaration customsDeclaration;

    public void changeCustomsDeclaration(CustomsDeclaration customsDeclaration) {
        this.customsDeclaration = customsDeclaration;
    }

}
