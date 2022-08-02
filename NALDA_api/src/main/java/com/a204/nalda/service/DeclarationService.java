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
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DeclarationService {

    private final CustomsDeclarationRepository customsDeclarationRepository;
    private final UserRepository userRepository;


    @Transactional
    public void saveDeclaration(DeclarationDTO declarationDTO) {

        User user = userRepository.findUserByUsername(declarationDTO.getUsername());
        CustomsDeclaration declaration = CustomsDeclaration.builder()
                .user(user)
                .accompany(Optional.ofNullable(declarationDTO.getAccompany()).orElse(0))
                .alcohols(declarationDTO.getAlcohols())
                .cigarettes(Optional.ofNullable(declarationDTO.getCigarette()).orElse(0))
                .dutyfreeExceed(declarationDTO.getDutyfreeExceed())
                .flightNum(declarationDTO.getFlightNum())
                .livestockVisited(declarationDTO.getLivestockVisited())
                .paymentExceed(declarationDTO.getPaymentExceed())
                .perfumes(Optional.ofNullable(declarationDTO.getPerfumes()).orElse(0))
                .preferentialTariff(declarationDTO.getPreferentialTariff())
                .prohibitGoods(declarationDTO.getProhibitGoods())
                .purposeTravel(declarationDTO.getPurposeTravel())
                .travelPeriod(Optional.ofNullable(declarationDTO.getTravelPeriod()).orElse(0))
                .salesGoods(declarationDTO.getSalesGoods())
                .dutyfreeExceedValue(Optional.ofNullable(declarationDTO.getDutyfreeExceedValue()).orElse(0))
                .paymentExceedValue(Optional.ofNullable(declarationDTO.getPaymentExceedValue()).orElse(0))
                .date(declarationDTO.getDate())
                .build();
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
                    .dutyfreeExceedValue(customDeclaration.getDutyfreeExceedValue())
                    .paymentExceedValue(customDeclaration.getPaymentExceedValue())
                    .date(customDeclaration.getDate())
                    .build();
            list.add(declarationListDTO);
        }
        return list;
    }

    @Transactional
    public DeclarationListDTO getOneDeclaration(Long id) {
        Optional<CustomsDeclaration> declaration = customsDeclarationRepository.findById(id);

        if(declaration.isPresent()) {
            CustomsDeclaration customsDeclaration = declaration.get();
            System.out.println(customsDeclaration);
            Alcohols alcohols = customsDeclaration.getAlcohols();
            List<EtcExceed> etcExceeds = customsDeclaration.getEtcExceeds();
            List<VisitedCountry> visitedCountries = customsDeclaration.getVisitedCountries();
            AlcoholsDTO alcoholsDTO = new AlcoholsDTO();
            List<EtcExceedDTO> etcExceedDTOS = new ArrayList<>();
            List<VisitedCountryDTO> visitedCountryDTOS = new ArrayList<>();

            for(int i =0;i<etcExceeds.size();i++) {
                EtcExceed etcExceed = etcExceeds.get(i);
                EtcExceedDTO etcExceedDTO = EtcExceedDTO.builder()
                        .name(etcExceed.getName())
                        .amount(etcExceed.getAmount())
                        .id(etcExceed.getId())
                        .num(etcExceed.getNum())
                        .build();
                etcExceedDTOS.add(etcExceedDTO);
            }

            for(int i =0; i<visitedCountries.size();i++) {
                VisitedCountry visitedCountry = visitedCountries.get(i);
                VisitedCountryDTO visitedCountryDTO = VisitedCountryDTO.builder()
                        .id(visitedCountry.getId())
                        .countryName(visitedCountry.getCountryName())
                        .build();
                visitedCountryDTOS.add(visitedCountryDTO);
            }

            if(alcohols != null) {
                alcoholsDTO = AlcoholsDTO.builder()
                        .id(alcohols.getId())
                        .num(alcohols.getNum())
                        .liter(alcohols.getLiter())
                        .dollar(alcohols.getDollar())
                        .build();
            }

            DeclarationListDTO result = DeclarationListDTO.builder()
                    .id(customsDeclaration.getId())
                    .alcohols(alcoholsDTO)
                    .etcExceeds(etcExceedDTOS)
                    .visitedCountries(visitedCountryDTOS)
                    .accompany(customsDeclaration.getAccompany())
                    .dutyfreeExceed(customsDeclaration.getDutyfreeExceed())
                    .flightNum(customsDeclaration.getFlightNum())
                    .cigarette(customsDeclaration.getCigarettes())
                    .livestockVisited(customsDeclaration.getLivestockVisited())
                    .paymentExceed(customsDeclaration.getPaymentExceed())
                    .perfumes(customsDeclaration.getPerfumes())
                    .preferentialTariff(customsDeclaration.getPreferentialTariff())
                    .prohibitGoods(customsDeclaration.getProhibitGoods())
                    .purposeTravel(customsDeclaration.getPurposeTravel())
                    .salesGoods(customsDeclaration.getSalesGoods())
                    .travelPeriod(customsDeclaration.getTravelPeriod())
                    .dutyfreeExceedValue(customsDeclaration.getDutyfreeExceedValue())
                    .paymentExceedValue(customsDeclaration.getPaymentExceedValue())
                    .date(customsDeclaration.getDate())
                    .build();

            return result;
        }

        return new DeclarationListDTO();

    }


}
