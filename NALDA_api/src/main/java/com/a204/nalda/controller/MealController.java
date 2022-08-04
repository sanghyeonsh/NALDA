package com.a204.nalda.controller;

import com.a204.nalda.dto.meal.*;
import com.a204.nalda.service.MealService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/input/{flightNum}")
    public ResponseEntity<?> mealsByFlight(@PathVariable("flightNum") String flightNum) {
        Map<String,Object> result = new HashMap<>();
        try {
            List<MealDto> mealDTOS = mealService.listInputMeal(flightNum);
            result.put("meal", mealDTOS);
            return new ResponseEntity<>(result,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/select/{mealId}")
    public ResponseEntity<?> mealInfoByMeal(@PathVariable("mealId") Long mealId) {
        Map<String,Object> result = new HashMap<>();
        try {
            MealDto mealDto = mealService.mealInfo(mealId);
            result.put("mealInfo", mealDto);
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
        System.out.println(seatMealDto.toString());
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
    @GetMapping("/choice/{flightNum}")
    public ResponseEntity<?> getSeatMeal(@PathVariable("flightNum") String flightNum) {
        Map<String,Object> result = new HashMap<>();
        try {
            List<SeatMealDto> seatMealDTOS = mealService.listSeatMeal(flightNum);
            result.put("seatMeal",seatMealDTOS);
            return new ResponseEntity<>(result,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

}
