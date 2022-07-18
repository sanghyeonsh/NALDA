package com.a204.nalda_api.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class CustomsDeclaration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "declaration_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Embedded
    private TravelPeriod travelPeriod;

    @Column(name = "purpose_travel")
    private String purposeTravel;

    @Column(name = "flight_num")
    private String flightNum;

    private int accompany;

    @Column(name = "dutyfree_exceed")
    private String dutyfree_exceed;

    @Column(name = "preferential_tariff")
    private String preferentialTariff;

    @Column(name = "payment_exceed")
    private String paymentExceed;

    @Column(name = "prohibit_goods")
    private String prohibit_goods;

    @Column(name = "livestock_visited")
    private String livestockVisited;

    @Column(name = "sales_goods")
    private String salesGoods;

    private String alcohols;
    private String cigarettes;
    private String perfumes;

    @Column(name = "etc_exceed")
    private String etcExceed;

    @OneToMany(mappedBy = "customsDeclaration", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<VisitedCountry> visitedCountries = new ArrayList<>();

    //연관 관계 메소드
    public void addVisitedCountry(VisitedCountry visitedCountry) {
        this.visitedCountries.add(visitedCountry);
        visitedCountry.setCustomsDeclaration(this);
    }
}
