package com.a204.nalda.service;

import com.a204.nalda.domain.entity.airplane.Airplane;
import com.a204.nalda.domain.entity.airplane.Flight;
import com.a204.nalda.dto.flight.FlightDto;
import com.a204.nalda.dto.flight.FlightInfoDto;
import com.a204.nalda.repository.AirplaneRepository;
import com.a204.nalda.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;
    private final AirplaneRepository airplaneRepository;
    public void inputFlightInfo(FlightDto flightDto){
        Airplane airplane = airplaneRepository.findByAirplaneKind(flightDto.getAirplaneKind());
        Flight flight = Flight.builder()
                .flightNum(flightDto.getFlightNum())
                .flightDate(flightDto.getFlightDate())
                .airplane(airplane)
                .build();
        flightRepository.save(flight);
    }

    public FlightInfoDto getFlightInfo(String flightNum){
        Long airplaneId = flightRepository.findTopByFlightNumOrderByIdDesc(flightNum).getAirplane().getId();
        Airplane airplane = airplaneRepository.findById(airplaneId).get();
        FlightInfoDto flightInfoDto = FlightInfoDto.builder()
                .flightNum(flightNum)
                .airplaneKind(airplane.getAirplaneKind())
                .build();
        return flightInfoDto;
    }
}
