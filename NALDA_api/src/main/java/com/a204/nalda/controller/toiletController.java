package com.a204.nalda.controller;

import com.a204.nalda.dto.inflightservice.ToiletDTO;
import com.a204.nalda.service.ToiletService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/toilet")
public class toiletController {

    private final ToiletService toiletService;

    @GetMapping("/{airplane}")
    public ResponseEntity<?> getToiletLog(@PathVariable("airplane") String airplane) {
        Map<String,Object> result = new HashMap<>();
        List<ToiletDTO> toiletDTO = toiletService.getToiletLog(airplane);
        try {
            result.put("toiletLog", toiletDTO);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            result.put("msg",e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
