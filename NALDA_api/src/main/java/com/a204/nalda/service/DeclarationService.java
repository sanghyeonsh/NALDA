package com.a204.nalda.service;

import com.a204.nalda.domain.entity.customsDeclaration.CustomsDeclaration;
import com.a204.nalda.domain.entity.customsDeclaration.EtcExceed;
import com.a204.nalda.domain.entity.customsDeclaration.VisitedCountry;
import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.dto.customdeclaration.DeclarationDTO;
import com.a204.nalda.repository.CustomsDeclarationRepository;
import com.a204.nalda.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public List<DeclarationDTO> selectDeclarationList(String username) {
        PageRequest pageRequest = PageRequest.of(0,25, Sort.Direction.DESC);
        Page<CustomsDeclaration> declarationList = customsDeclarationRepository.findByUsername(username,pageRequest);

        int totalPage = declarationList.getTotalPages();
        declarationList.

    }


}
