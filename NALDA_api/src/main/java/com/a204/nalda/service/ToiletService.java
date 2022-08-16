package com.a204.nalda.service;

import com.a204.nalda.domain.entity.inflightservice.ToiletLog;
import com.a204.nalda.dto.inflightservice.ToiletDTO;
import com.a204.nalda.repository.ToiletRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ToiletService {
    private final ToiletRepository toiletRepository;

    @Transactional
    public List<ToiletDTO> getToiletLog(String airplaneKind) {
        List<ToiletLog> toiletLog = toiletRepository.findByAirplaneKind(airplaneKind);
        List<ToiletDTO> toiletDTOS = new ArrayList<>();
        Set<String> set = new HashSet<>();

        for (ToiletLog log : toiletLog) {
            if(set.add(log.getToilet().getToiletCode())) {
                System.out.println(log.getTime());
                ToiletDTO toiletDTO = ToiletDTO.builder()
                        .toiletCode(log.getToilet().getToiletCode())
                        .used(log.getUsed())
                        .build();
                toiletDTOS.add(toiletDTO);
            }
        }

        return toiletDTOS;
    }
}
