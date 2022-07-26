package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EtcExceed {
    @Id
    @GeneratedValue
    @Column(name = "etc_exceed_id")
    private Long id;

    private String name;
    private int num;
    private float amount;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customs_declaration_id")
    private CustomsDeclaration customsDeclaration;

    public void changeCustomsDeclaration(CustomsDeclaration customsDeclaration) {
        this.customsDeclaration = customsDeclaration;
    }
}
