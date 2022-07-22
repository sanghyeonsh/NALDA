package com.a204.nalda.domain.entity.customsDeclaration;

import com.a204.nalda.domain.embedded.TravelPeriod;
import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.domain.enumtype.Permission;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomsDeclaration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customs_declaration_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Embedded
    private TravelPeriod travelPeriod;
    private String purposeTravel;
    private String flightNum;
    private int accompany;

    @Enumerated(EnumType.STRING)
    @Column(name = "dutyfree_exceed")
    private Permission dutyfreeExceed;

    @Enumerated(EnumType.STRING)
    @Column(name = "preferential_tariff")
    private Permission preferentialTariff;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_exceed")
    private Permission paymentExceed;

    @Enumerated
    @Column(name = "prohibit_goods")
    private Permission prohibitGoods;

    @Enumerated
    @Column(name = "livestock_visited")
    private Permission livestockVisited;

    @Enumerated
    @Column(name = "sales_goods")
    private Permission salesGoods;

    private int cigarettes;
    private int perfumes;

    @OneToOne(fetch = LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "alcohols_id")
    private Alcohols alcohols;

    @OneToMany(mappedBy = "customsDeclaration", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<EtcExceed> etcExceeds = new ArrayList<>();

    @OneToMany(mappedBy = "customsDeclaration", cascade = CascadeType.ALL, orphanRemoval = true)
    @Builder.Default
    private List<VisitedCountry> visitedCountries = new ArrayList<>();

    public void addEtcExceed(EtcExceed etcExceed) {
        etcExceeds.add(etcExceed);
        etcExceed.changeCustomsDeclaration(this);
    }

    public void addVisitedCountry(VisitedCountry visitedCountry) {
        visitedCountries.add(visitedCountry);
        visitedCountry.changeCustomsDeclaration(this);
    }


}
