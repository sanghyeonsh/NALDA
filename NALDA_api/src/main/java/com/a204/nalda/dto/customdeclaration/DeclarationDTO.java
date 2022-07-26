package com.a204.nalda.dto.customdeclaration;

import com.a204.nalda.domain.embedded.TravelPeriod;
import com.a204.nalda.domain.entity.customsDeclaration.Alcohols;
import com.a204.nalda.domain.entity.customsDeclaration.EtcExceed;
import com.a204.nalda.domain.entity.customsDeclaration.VisitedCountry;
import com.a204.nalda.domain.enumtype.Permission;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeclarationDTO  implements Serializable {

    private Long id;
    private String username;
    private TravelPeriod travelPeriod;
    private String purposeTravel;
    private String flightNum;
    private int accompany;

    private Permission dutyfreeExceed;
    private Permission preferentialTariff;
    private Permission paymentExceed;
    private Permission prohibitGoods;
    private Permission livestockVisited;
    private Permission salesGoods;

    private int cigarette;
    private int perfumes;

    private Alcohols alcohols;
    private List<EtcExceed> etcExceeds;
    private List<VisitedCountry> visitedCountries;
}
