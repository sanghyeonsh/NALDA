package com.a204.nalda.controller;

import com.a204.nalda.dto.meal.*;
import com.a204.nalda.dto.orders.OrderCntDto;
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
    @PutMapping("/end/{flightNum}")
    public ResponseEntity<?> endMeals(@PathVariable("flightNum") String flightNum){
        Map<String,Object> result = new HashMap<>();
        try{
            mealService.updateStatus(flightNum);
            result.put("msg","변경 성공!");
            return new ResponseEntity<>(result, HttpStatus.OK);

        }catch (Exception e){
            e.printStackTrace();
            result.put("msg",e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/confirm/{seatNum}")
    public ResponseEntity<?> confirmMeal(@PathVariable("seatNum") String seatNum) {
        Map<String,Object> result = new HashMap<>();
        try{
            String check = mealService.getMealBySeat(seatNum);
            if(check.equals("1")){
                result.put("msg","불가능");
            }else{
                result.put("msg","가능");
            }
            return new ResponseEntity<>(result,HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg",e.getMessage());
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

    @GetMapping("/count/{flightNum}")
    public ResponseEntity<?> getMealsCnt(@PathVariable("flightNum") String flightNum){
        Map<String, Object> result = new HashMap<>();
        try{
            List<MealCntDto> mealCntDTOS = mealService.mealCnt(flightNum);
            result.put("mealCntList",mealCntDTOS);
            return new ResponseEntity<>(result,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
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

    @GetMapping("/total/{flightNum}")
    public ResponseEntity<?> getSeatMealCnt(@PathVariable("flightNum") String flightNum) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<SeatMealCntDto> seatMealCntDTOS = mealService.seatMealCnt(flightNum);
            result.put("seatMealCnt",seatMealCntDTOS);
            return new ResponseEntity<>(result,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
