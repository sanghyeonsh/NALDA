package com.a204.nalda.service;

import com.a204.nalda.domain.entity.inflightservice.Subway;
import com.a204.nalda.dto.subway.SubwayDto;
import com.a204.nalda.repository.SubwayRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class SubwayService {

    private final SubwayRepository subwayRepository;

    @Transactional
    public void inputInfo(List<SubwayDto> subwayDtoList){

        for(SubwayDto subwayDto : subwayDtoList){

            Subway subway = Subway.builder()
                    .name(subwayDto.getName())
                    .time(subwayDto.getTime())
                    .end(subwayDto.getEnd())
                    .dayCode(subwayDto.getDayCode())
                    .build();
            subwayRepository.save(subway);
        }


    }

    @Transactional
    public List<SubwayDto> getSubway(){
        List<Subway> subways = subwayRepository.findAll();
        List<SubwayDto> subwayDtoList = new ArrayList<>();
        for(Subway subway:subways){
            subwayDtoList.add(
                    SubwayDto.builder()
                            .name(subway.getName())
                            .dayCode(subway.getDayCode())
                            .end(subway.getEnd())
                            .time(subway.getTime())
                            .build()
            );
        }
        return subwayDtoList;
    }

}
