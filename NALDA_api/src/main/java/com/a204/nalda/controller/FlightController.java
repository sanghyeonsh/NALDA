package com.a204.nalda.controller;

import com.a204.nalda.dto.flight.FlightDto;
import com.a204.nalda.dto.flight.FlightInfoDto;
import com.a204.nalda.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{flightNum}")
    public ResponseEntity<?> inputFlight(@PathVariable("flightNum") String flightNum) {
        Map<String, Object> result = new HashMap<>();
        try{
            FlightInfoDto flightInfoDto = flightService.getFlightInfo(flightNum);
            result.put("flightInfo",flightInfoDto);
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg",e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{flightNum}")
    public ResponseEntity<?> finishFlight(@PathVariable("flightNum") String flightNum) {
        Map<String, Object> result = new HashMap<>();
        try {
            flightService.modifyStatus(flightNum);
            result.put("msg","변경 성공");
            return new ResponseEntity<>(result,HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg",e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }
}