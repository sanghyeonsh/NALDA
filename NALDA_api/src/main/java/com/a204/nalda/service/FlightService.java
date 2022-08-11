package com.a204.nalda.service;

import com.a204.nalda.domain.entity.airplane.Airplane;
import com.a204.nalda.domain.entity.airplane.Flight;
import com.a204.nalda.domain.enumtype.Status;
import com.a204.nalda.dto.flight.FlightDto;
import com.a204.nalda.dto.flight.FlightInfoDto;
import com.a204.nalda.repository.AirplaneRepository;
import com.a204.nalda.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;
    private final AirplaneRepository airplaneRepository;
    @Transactional
    public void inputFlightInfo(FlightDto flightDto){
        Airplane airplane = airplaneRepository.findByAirplaneKind(flightDto.getAirplaneKind());
        Status status = Status.valueOf(flightDto.getStatus());
        Flight flight = Flight.builder()
                .flightNum(flightDto.getFlightNum())
                .flightDate(Optional.ofNullable(flightDto.getFlightDate()).orElse(LocalDateTime.now()))
                .airplane(airplane)
                .status(status)
                .build();
        flightRepository.save(flight);
    }

    @Transactional
    public boolean getFlightInfo(String flightNum){
        Optional<Flight> optional = flightRepository.findByFlightNumAndStatus(flightNum);
        if(optional.isPresent()){
            return true;
        }else{
            return false;
        }
    }


    @Transactional
    public void modifyStatus(String flightNum){

        Flight flight = flightRepository.findByFlightNumAndStatus(flightNum).get();
        flight.changeStatusInfo(Status.DONE);

    }

}
