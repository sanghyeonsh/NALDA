package com.a204.nalda.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Alcohols {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "alcohols_id")
    private Long id;

    private int num;
    private float liter;
    private float dollar;

    @OneToOne(mappedBy = "alcohols")
    private CustomsDeclaration customsDeclaration;
}
