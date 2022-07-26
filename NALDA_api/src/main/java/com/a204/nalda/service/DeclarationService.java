package com.a204.nalda.service;

import com.a204.nalda.domain.entity.customsDeclaration.Alcohols;
import com.a204.nalda.domain.entity.customsDeclaration.CustomsDeclaration;
import com.a204.nalda.domain.entity.customsDeclaration.EtcExceed;
import com.a204.nalda.domain.entity.customsDeclaration.VisitedCountry;
import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.dto.customdeclaration.*;
import com.a204.nalda.repository.CustomsDeclarationRepository;
import com.a204.nalda.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DeclarationService {

    private final CustomsDeclarationRepository customsDeclarationRepository;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;
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

    @Transactional
    public List<DeclarationListDTO> selectDeclarationList(String username) {
        List<CustomsDeclaration> customsDeclarations = customsDeclarationRepository.findByUsername(username);
        List<DeclarationListDTO> list = new ArrayList<>();

        for (CustomsDeclaration customDeclaration : customsDeclarations) {
            Alcohols alcohols = customDeclaration.getAlcohols();
            List<EtcExceedDTO> etcExceedList = new ArrayList<>();
            List<VisitedCountryDTO> visitedCountryList = new ArrayList<>();
            AlcoholsDTO alcoholsDTO = new AlcoholsDTO();

            if(alcohols != null) {
                alcoholsDTO = AlcoholsDTO
                        .builder()
                        .dollar(alcohols.getDollar())
                        .liter(alcohols.getLiter())
                        .num(alcohols.getNum())
                        .id(alcohols.getId()).build();
            }

            for(EtcExceed etcExceed: customDeclaration.getEtcExceeds()) {
                EtcExceedDTO etcExceedDTO = EtcExceedDTO.builder()
                        .amount(etcExceed.getAmount())
                        .name(etcExceed.getName())
                        .num(etcExceed.getNum())
                        .id(etcExceed.getId())
                        .build();

                etcExceedList.add(etcExceedDTO);
            }


            for(VisitedCountry visitedCountry : customDeclaration.getVisitedCountries()) {
                VisitedCountryDTO visitedCountryDTO = VisitedCountryDTO.builder()
                        .countryName(visitedCountry.getCountryName())
                        .id(visitedCountry.getId()).build();
                visitedCountryList.add(visitedCountryDTO);
            }



            DeclarationListDTO declarationListDTO = DeclarationListDTO.builder()
                    .accompany(customDeclaration.getAccompany())
                    .cigarette(customDeclaration.getCigarettes())
                    .dutyfreeExceed(customDeclaration.getDutyfreeExceed())
                    .flightNum(customDeclaration.getFlightNum())
                    .livestockVisited(customDeclaration.getLivestockVisited())
                    .paymentExceed(customDeclaration.getPaymentExceed())
                    .perfumes(customDeclaration.getPerfumes())
                    .preferentialTariff(customDeclaration.getPreferentialTariff())
                    .prohibitGoods(customDeclaration.getProhibitGoods())
                    .purposeTravel(customDeclaration.getPurposeTravel())
                    .salesGoods(customDeclaration.getSalesGoods())
                    .travelPeriod(customDeclaration.getTravelPeriod())
                    .id(customDeclaration.getId())
                    .alcohols(alcoholsDTO)
                    .etcExceeds(etcExceedList)
                    .visitedCountries(visitedCountryList)
                    .build();
            list.add(declarationListDTO);
        }

        return list;


    }


}
