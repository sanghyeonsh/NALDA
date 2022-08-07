package com.a204.nalda.controller;

import com.a204.nalda.dto.subway.SubwayDto;
import com.a204.nalda.service.SubwayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/subway")
public class SubwayController {

    private final SubwayService subwayService;

    @PostMapping
    public ResponseEntity<?> inputInfo(@RequestBody List<SubwayDto> subwayDto) {
        Map<String, Object> result = new HashMap<>();

        try {
            subwayService.inputInfo(subwayDto);
            result.put("msg","데이터가 성공적으로 보내졌습니다.");
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<?> listServices() {
        Map<String, Object> result = new HashMap<>();
        try {
            List<SubwayDto> subwayDTOS = subwayService.getSubway();
            result.put("subwayList",subwayDTOS);
            return new ResponseEntity<>(result,HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    


}
