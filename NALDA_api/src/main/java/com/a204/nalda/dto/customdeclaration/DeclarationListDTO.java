package com.a204.nalda.dto.customdeclaration;

import com.a204.nalda.domain.embedded.TravelPeriod;
import com.a204.nalda.domain.entity.customsDeclaration.Alcohols;
import com.a204.nalda.domain.entity.customsDeclaration.EtcExceed;
import com.a204.nalda.domain.entity.customsDeclaration.VisitedCountry;
import com.a204.nalda.domain.enumtype.Permission;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DeclarationListDTO {
    private Long id;
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

    private AlcoholsDTO alcohols;
    private List<EtcExceedDTO> etcExceeds;
    private List<VisitedCountryDTO> visitedCountries;
}
