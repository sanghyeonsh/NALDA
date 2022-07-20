package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Alcohols {
    @Id
    @GeneratedValue
    @Column(name = "alcohols_id")
    private Long id;

    private int num;
    private float liter;
    private float dollar;

    @OneToOne(mappedBy = "alcohols")
    private CustomsDeclaration customsDeclaration;
}
