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
public class EtcExceed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
