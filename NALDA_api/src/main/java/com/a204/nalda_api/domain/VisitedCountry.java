package com.a204.nalda_api.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class VisitedCountry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "visit_id")
    private Long id;

    @Column(name = "country_name")
    private String CountryName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "declaration_id")
    private CustomsDeclaration customsDeclaration;

}
