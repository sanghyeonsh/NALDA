package com.a204.nalda.controller;

import com.a204.nalda.dto.meal.*;
import com.a204.nalda.service.MealService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/meal")
public class MealController {

    private final MealService mealService;

    @GetMapping
    public ResponseEntity<?> listMeals(){
        Map<String, Object> result = new HashMap<>();
        try{
            List<MealDto> mealDTOS = mealService.listMeal();
            result.put("mealList", mealDTOS);
            return new ResponseEntity<>(result,HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/input")
    public ResponseEntity<?> selectMeals(@RequestBody List<MealCntDto> mealCntDTOS){
        Map<String,Object> result = new HashMap<>();
        try {
            mealService.mealCntInput(mealCntDTOS);
            result.put("info", mealCntDTOS);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/input/{flightId}")
    public ResponseEntity<?> mealsByFlight(@PathVariable("flightId") Long flightId) {
        Map<String,Object> result = new HashMap<>();
        try {
            List<MealDto> mealDTOS = mealService.listInputMeal(flightId);
            result.put("meal", mealDTOS);
            return new ResponseEntity<>(result,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/detail/{mealId}")
    public ResponseEntity<?> mealDetailsByMeal(@PathVariable("mealId") Long mealId) {
        Map<String,Object> result = new HashMap<>();
        try {
            List<MealDetailDto> mealDetailDTOS = mealService.listMealDetail(mealId);
            result.put("mealDetail", mealDetailDTOS);
            return new ResponseEntity<>(result,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/allergy/{mealId}")
    public ResponseEntity<?> allergyByMeal(@PathVariable("mealId") Long mealId) {
        Map<String,Object> result = new HashMap<>();
        try {
            List<AllergyDto> allergyDTOS = mealService.listAllergy(mealId);
            result.put("mealAllergy", allergyDTOS);
            return new ResponseEntity<>(result,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("/choice")
    public ResponseEntity<?> choiceMeal(@RequestBody SeatMealDto seatMealDto){
        Map<String,Object> result = new HashMap<>();
        try{
            mealService.seatMealInput(seatMealDto);
            result.put("info",seatMealDto);
            return new ResponseEntity<>(result,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
