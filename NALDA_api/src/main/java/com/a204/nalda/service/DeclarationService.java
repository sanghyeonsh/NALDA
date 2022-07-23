package com.a204.nalda.service;

import com.a204.nalda.domain.entity.customsDeclaration.CustomsDeclaration;
import com.a204.nalda.domain.entity.customsDeclaration.EtcExceed;
import com.a204.nalda.domain.entity.customsDeclaration.VisitedCountry;
import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.dto.customdeclaration.DeclarationDTO;
import com.a204.nalda.repository.AlcoholsRepository;
import com.a204.nalda.repository.CustomsDeclarationRepository;
import com.a204.nalda.repository.UserRepository;
import com.a204.nalda.repository.VisitedCountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class DeclarationService {

    private final CustomsDeclarationRepository customsDeclarationRepository;
    private final UserRepository userRepository;
    private final AlcoholsRepository alcoholsRepository;
    private final VisitedCountryRepository visitedCountryRepository;

    @Transactional
    public void saveDeclaration(DeclarationDTO declarationDTO) {

        User user = userRepository.findUserByUsername(declarationDTO.getUsername());

        CustomsDeclaration declaration = CustomsDeclaration.builder()
                .user(user)
                .accompany(declarationDTO.getAccompany())
                .alcohols(declarationDTO.getAlcohols())
                .cigarettes(declarationDTO.getCigarette())
                .dutyfreeExceed(declarationDTO.getDutyfreeExceed())
                .flightNum(declarationDTO.getFlightNum())
                .livestockVisited(declarationDTO.getLivestockVisited())
                .paymentExceed(declarationDTO.getPaymentExceed())
                .perfumes(declarationDTO.getPerfumes())
                .preferentialTariff(declarationDTO.getPreferentialTariff())
                .prohibitGoods(declarationDTO.getProhibitGoods())
                .purposeTravel(declarationDTO.getPurposeTravel())
                .travelPeriod(declarationDTO.getTravelPeriod())
                .salesGoods(declarationDTO.getSalesGoods())
                .build();
        System.out.println(declaration.getVisitedCountries());
        if(declaration.getVisitedCountries().size() > 0) {
            for( VisitedCountry visitedcountry : declarationDTO.getVisitedCountries()) {
                declaration.addVisitedCountry(visitedcountry);
            }
        }
        if(declaration.getEtcExceeds().size() >0) {
            for(EtcExceed etcExceed : declarationDTO.getEtcExceeds()) {
                declaration.addEtcExceed(etcExceed);
            }
        }

        customsDeclarationRepository.save(declaration);
    }


}
