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
        List<byte[]> images = new ArrayList<>();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try{
            List<MealDto> mealDTOS = mealService.listMeal();
            String fileName;
            String filePath;
            for (MealDto mealDTO : mealDTOS) {
                fileName = mealDTO.getImageName();
                filePath = System.getProperty("user.dir")+"/src/main/resources/static/meal/";
                InputStream imageStream = new FileInputStream(filePath+fileName);
                imageStream.transferTo(bos);
                byte[] bytesData = bos.toByteArray();
                images.add(bytesData);
                break;
            }
            result.put("mealList", mealDTOS);
            result.put("images", images);
            return new ResponseEntity<>(result,HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @PostMapping("/input")
    public ResponseEntity<?> selectMeals(@RequestBody MealCntDto mealCntDto){
        Map<String,Object> result = new HashMap<>();
        try {
            System.out.println(mealCntDto.getMealId());
            mealService.mealCntInput(mealCntDto);
            result.put("info", mealCntDto);
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
            result.put("mealDetail", allergyDTOS);
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
