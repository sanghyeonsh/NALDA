package com.a204.nalda.controller;

import com.a204.nalda.domain.entity.airplane.Flight;
import com.a204.nalda.dto.flight.FlightDto;
import com.a204.nalda.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/flight")
public class FlightController {

    private final FlightService flightService;

    @PostMapping
    public ResponseEntity<?> inputFlight(@RequestBody FlightDto flightDto) {
        Map<String, Object> result = new HashMap<>();
        try{
            flightService.inputFlightInfo(flightDto);
            result.put("msg","비행정보가 성공적으로 입력되었습니다");
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg",e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}