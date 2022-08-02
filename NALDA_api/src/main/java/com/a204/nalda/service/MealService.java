package com.a204.nalda.service;

import com.a204.nalda.domain.entity.airplane.Flight;
import com.a204.nalda.domain.entity.airplane.Seat;
import com.a204.nalda.domain.entity.airplane.SeatMeal;
import com.a204.nalda.domain.entity.inflightservice.Allergy;
import com.a204.nalda.domain.entity.inflightservice.Meal;
import com.a204.nalda.domain.entity.inflightservice.MealDetail;
import com.a204.nalda.domain.entity.inflightservice.MealStock;
import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.dto.meal.*;
import com.a204.nalda.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MealService {

    private final MealRepository mealRepository;
    private final MealStockRepository mealStockRepository;
    private final MealDetailRepository mealDetailRepository;
    private final AllergyRepository allergyRepository;
    private final FlightRepository flightRepository;
    private final UserRepository userRepository;
    private final SeatRepository seatRepository;
    private final SeatMealRepository seatMealRepository;

    @Transactional
    public List<MealDto> listMeal() throws IOException {
        List<Meal> meals = mealRepository.findAll();
        List<MealDto> mealDto = new ArrayList<>();
        ByteArrayOutputStream bos;
        String fileName;
        String filePath;
        for (Meal meal : meals) {
            bos = new ByteArrayOutputStream();
            fileName = meal.getImageName();
            filePath = System.getProperty("user.dir")+"/src/main/resources/static/meal/";
            InputStream imageStream = new FileInputStream(filePath + fileName);
            imageStream.transferTo(bos);
            byte[] bytesData = bos.toByteArray();

            mealDto.add(MealDto.builder()
                            .imageName(meal.getImageName())
                            .mealMenu(meal.getMealMenu())
                            .bytesdata(bytesData)
                            .build());
        }
        return mealDto;
    }

    @Transactional
    public void mealCntInput(List<MealCntDto> mealCntDTOS){

        for (MealCntDto mealCntDto : mealCntDTOS) {
            Long mealId = mealRepository.findTopByMealMenu(mealCntDto.getMealMenu()).getId();
            Meal meal = Meal.builder()
                    .id(mealId)
                    .build();
            Long flightId = flightRepository.findTopByFlightNumOrderByIdDesc(mealCntDto.getFlightNum()).getId();
            Flight flight = Flight.builder()
                    .id(flightId)
                    .build();
            MealStock mealStock = MealStock.builder()
                    .meal(meal)
                    .flight(flight)
                    .total(mealCntDto.getTotal())
                    .build();
            mealStockRepository.save(mealStock);
        }
    }

    @Transactional
    public List<MealDto> listInputMeal(String flightNum) throws IOException {
        Long flightId = flightRepository.findTopByFlightNumOrderByIdDesc(flightNum).getId();
        List<Meal> mealList = mealRepository.findByFlightId(flightId);
        List<MealDto> mealDTOS = new ArrayList<>();
        ByteArrayOutputStream bos;
        String fileName;
        String filePath;
        for (Meal meal : mealList) {
            System.out.println(meal.getMealMenu());
            bos = new ByteArrayOutputStream();
            fileName = meal.getImageName();
            filePath = System.getProperty("user.dir")+"/src/main/resources/static/meal/";
            InputStream imageStream = new FileInputStream(filePath + fileName);
            imageStream.transferTo(bos);
            byte[] bytesData = bos.toByteArray();
            MealDto mealDto = MealDto.builder()
                    .mealMenu(meal.getMealMenu())
                    .imageName(meal.getImageName())
                    .bytesdata(bytesData)
                    .build();
            mealDTOS.add(mealDto);
        }
        return mealDTOS;
    }

    @Transactional
    public MealDto mealInfo(String mealMenu) throws IOException {
//        Long mealId = mealRepository.findTopByMealMenu(mealMenu).getId();
        Meal mealInfo = mealRepository.findTopByMealMenu(mealMenu);
        ByteArrayOutputStream bos;
        String fileName;
        String filePath;
        bos = new ByteArrayOutputStream();
        fileName = mealInfo.getImageName();
        filePath = System.getProperty("user.dir")+"/src/main/resources/static/meal/";
        InputStream imageStream = new FileInputStream(filePath + fileName);
        imageStream.transferTo(bos);
        byte[] bytesData = bos.toByteArray();

        MealDto mealDto = MealDto.builder()
                .imageName(mealInfo.getImageName())
                .mealMenu(mealInfo.getMealMenu())
                .bytesdata(bytesData)
                .build();

        return mealDto;
    }
    @Transactional
    public List<MealDetailDto> listMealDetail(String mealMenu){
        Long mealId = mealRepository.findTopByMealMenu(mealMenu).getId();
        List<MealDetail> mealDetailList = mealDetailRepository.findByMeal(mealId);

        List<MealDetailDto> mealDetailDTOS = new ArrayList<>();

        for (MealDetail mealDetail : mealDetailList) {
            MealDetailDto mealDetailDto = MealDetailDto.builder()
                    .mealName(mealDetail.getMealName())
                    .build();
            mealDetailDTOS.add(mealDetailDto);
        }
        return mealDetailDTOS;
    }

    @Transactional
    public List<AllergyDto> listAllergy(String mealMenu){
        Long mealId = mealRepository.findTopByMealMenu(mealMenu).getId();
        List<Allergy> allergyList = allergyRepository.findByMeal(mealId);

        List<AllergyDto> allergyDTOS = new ArrayList<>();

        for (Allergy allergy : allergyList) {
            AllergyDto allergyDto = AllergyDto.builder()
                    .allergyType(allergy.getAllergyType())
                    .build();
            allergyDTOS.add(allergyDto);
        }
        return allergyDTOS;
    }


    public void seatMealInput(SeatMealDto seatMealDto){
//        System.out.println("====================");
//        System.out.println(seatMealDto.toString());
        Long mealId = mealRepository.findTopByMealMenu(seatMealDto.getMealMenu()).getId();
        Meal meal = Meal.builder()
                .id(mealId)
                .build();
        Long flightId = flightRepository.findTopByFlightNumOrderByIdDesc(seatMealDto.getFlightNum()).getId();
        Flight flight = Flight.builder()
                .id(flightId)
                .build();
        Long userId = userRepository.findTopByUsername(seatMealDto.getUsername()).getId();
        User user = User.builder()
                .id(userId)
                .build();
        Long seatId = seatRepository.findTopBySeatNum(seatMealDto.getSeatNum()).getId();
        Seat seat = Seat.builder()
                .id(seatId)
                .build();
        SeatMeal seatMeal = SeatMeal.builder()
                .meal(meal)
                .flight(flight)
                .user(user)
                .seat(seat)
                .build();

        seatMealRepository.save(seatMeal);
    }




}
