package com.a204.nalda.service;

import com.a204.nalda.domain.entity.airplane.Flight;
import com.a204.nalda.domain.entity.airplane.Seat;
import com.a204.nalda.domain.entity.airplane.SeatMeal;
import com.a204.nalda.domain.entity.inflightservice.Allergy;
import com.a204.nalda.domain.entity.inflightservice.Meal;
import com.a204.nalda.domain.entity.inflightservice.MealDetail;
import com.a204.nalda.domain.entity.inflightservice.MealStock;
import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.domain.enumtype.Status;
import com.a204.nalda.dto.meal.*;
import com.a204.nalda.repository.flight.FlightRepository;
import com.a204.nalda.repository.flight.SeatRepository;
import com.a204.nalda.repository.meal.*;
import com.a204.nalda.repository.user.UserRepository;
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
    private final SeatMealCntRepository seatMealCntRepository;

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
//        Optional<MealStock> mealValid = mealStockRepository.findTopByFlightNum(mealCntDTOS.get(0).getFlightNum());
        List<MealStock> mealValid = mealStockRepository.findByFlightNum(mealCntDTOS.get(0).getFlightNum());
        if(mealValid.size()==0){
            for (MealCntDto mealCntDto : mealCntDTOS) {
                Long mealId = mealRepository.findTopByMealMenu(mealCntDto.getMealMenu()).getId();
                Meal meal = Meal.builder()
                        .id(mealId)
                        .build();
                Long flightId = flightRepository.findByFlightNumAndStatus(mealCntDto.getFlightNum()).get().getId();
                Flight flight = Flight.builder()
                        .id(flightId)
                        .build();
                MealStock mealStock = MealStock.builder()
                        .meal(meal)
                        .flight(flight)
                        .total(mealCntDto.getTotal())
                        .status(mealCntDto.getStatus())
                        .build();
                mealStockRepository.save(mealStock);
            }
        }else {
            for (int i=0;i<mealValid.size();i++) {
                mealValid.get(i).changeStatusInfo(mealCntDTOS.get(i).getStatus());
            }
        }
    }

    @Transactional
    public void updateStatus(String flightNum){
        List<MealStock> mealStocks = mealStockRepository.findByFlightNum(flightNum);
        for (MealStock mealStock : mealStocks) {
            if(mealStock.getStatus()==Status.PROGRESS){
                mealStock.changeStatusInfo(Status.DONE);
            }
        }
        List<SeatMeal> seatMeals = seatMealRepository.findByFlightNum(flightNum);
        for (SeatMeal seatMeal : seatMeals) {
            seatMeal.changeStatusInfo(Status.DONE);
        }
    }

    @Transactional
    public String getMealBySeat(String seatNum){
        SeatMeal seatMeal = seatMealRepository.findBySeatNum(seatNum);
        String check;
        if(seatMeal != null){
            check = "1";
        }else{
            check = "0";
        }
        return check;
    }

    @Transactional
    public List<MealCntDto> mealCnt(String flightNum){
        List<MealStock> mealStocks = mealStockRepository.findByFlightNum(flightNum);
        List<MealCntDto> mealCntDTOS = new ArrayList<>();
        for(MealStock mealStock:mealStocks){
            mealCntDTOS.add(MealCntDto.builder()
                            .flightNum(mealStock.getFlight().getFlightNum())
                            .mealId(mealStock.getMeal().getId())
                            .mealMenu(mealStock.getMeal().getMealMenu())
                            .status(mealStock.getStatus())
                            .total(mealStock.getTotal())
                            .build());
        }
        return mealCntDTOS;
    }

    @Transactional
    public List<MealDto> listInputMeal(String flightNum) throws IOException {
        List<Meal> mealList = mealRepository.findByFlightNum(flightNum);
        List<MealDto> mealDTOS = new ArrayList<>();
        ByteArrayOutputStream bos;
        String fileName;
        String filePath;
        for (Meal meal : mealList) {
            bos = new ByteArrayOutputStream();
            fileName = meal.getImageName();
            filePath = System.getProperty("user.dir")+"/src/main/resources/static/meal/";
            InputStream imageStream = new FileInputStream(filePath + fileName);
            imageStream.transferTo(bos);
            byte[] bytesData = bos.toByteArray();
            MealStock mealStock = mealStockRepository.findByFlightNumAndMealId(flightNum,meal.getId());
            MealDto mealDto = MealDto.builder()
                    .mealId(meal.getId())
                    .mealMenu(meal.getMealMenu())
                    .imageName(meal.getImageName())
                    .content(meal.getContent())
                    .bytesdata(bytesData)
                    .status(mealStock.getStatus())
                    .build();
            mealDTOS.add(mealDto);
        }
        return mealDTOS;
    }

    @Transactional
    public MealDto mealInfo(Long mealId) throws IOException {
        Meal mealInfo = mealRepository.findById(mealId).get();
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
                .content(mealInfo.getContent())
                .bytesdata(bytesData)
                .build();

        return mealDto;
    }
    @Transactional
    public List<MealDetailDto> listMealDetail(Long mealId){
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
    public List<AllergyDto> listAllergy(Long mealId){
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
        Meal meal = mealRepository.findTopByMealMenu(seatMealDto.getMealMenu());
        Flight flight = flightRepository.findByFlightNumAndStatus(seatMealDto.getFlightNum()).get();
        User user = userRepository.findTopByUsername(seatMealDto.getUsername());
        Seat seat = seatRepository.findTopBySeatNum(seatMealDto.getSeatNum());
        SeatMeal seatMeal = SeatMeal.builder()
                .status(Status.PROGRESS)
                .meal(meal)
                .flight(flight)
                .user(user)
                .seat(seat)
                .build();
        seatMealRepository.save(seatMeal);
    }

    public List<SeatMealDto> listSeatMeal(String flightNum){
        List<SeatMeal> seatMeals = seatMealRepository.findByFlightNum(flightNum);
        List<SeatMealDto> seatMealDTOS = new ArrayList<>();
        for (SeatMeal seatMeal : seatMeals) {
            String mealMenu = mealRepository.findById(seatMeal.getMeal().getId()).get().getMealMenu();
            String seatNum = seatRepository.findById(seatMeal.getSeat().getId()).get().getSeatNum();
            String username = userRepository.findById(seatMeal.getUser().getId()).get().getUsername();
            SeatMealDto seatMealDto = SeatMealDto.builder()
                    .flightNum(flightNum)
                    .mealMenu(mealMenu)
                    .seatNum(seatNum)
                    .username(username)
                    .build();
            seatMealDTOS.add(seatMealDto);
        }
        return seatMealDTOS;
    }

    public List<SeatMealCntDto> seatMealCnt(String flightNum){
        List<SeatMealCntDto> seatMealCntDTOS = seatMealCntRepository.findByFlightNumAndMealMenu(flightNum);
        return seatMealCntDTOS;
    }


}
