package com.a204.nalda.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VisitedCountry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "visited_country_id")
    private Long id;

    @Column(name = "country_name")
    private String countryName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customs_declaration_id")
    private CustomsDeclaration customsDeclaration;

    public void changeCustomsDeclaration(CustomsDeclaration customsDeclaration) {
        this.customsDeclaration = customsDeclaration;
    }

}
