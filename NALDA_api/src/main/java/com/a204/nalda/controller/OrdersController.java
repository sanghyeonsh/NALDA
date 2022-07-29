package com.a204.nalda.controller;


import com.a204.nalda.dto.meal.MealCntDto;
import com.a204.nalda.dto.orders.OrderDto;
import com.a204.nalda.dto.orders.OrderListDto;
import com.a204.nalda.dto.orders.ServiceCntDto;
import com.a204.nalda.dto.orders.ServiceDto;
import com.a204.nalda.service.OrdersService;
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
@RequestMapping("/orders")
public class OrdersController {

    private final OrdersService ordersService;

    @GetMapping("/{serviceClass}")
    public ResponseEntity<?> listServices(@PathVariable("serviceClass") String serviceClass) {
        Map<String, Object> result = new HashMap<>();


        try {
            List<ServiceDto> serviceDTOS = ordersService.servicesByClass(serviceClass);

            result.put("service",serviceDTOS);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/submit")
    public ResponseEntity<?> submitOrders(@RequestBody OrderDto orders){
        Map<String, Object> result = new HashMap<>();

        try{
            ordersService.orderInput(orders);
            result.put("info","주문이 정상적으로 접수되었습니다.");
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg",e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }

    @PostMapping("/input")
    public ResponseEntity<?> selectServices(@RequestBody ServiceCntDto serviceCntDto){
        Map<String,Object> result = new HashMap<>();
        try {
            System.out.println(serviceCntDto.getServiceCodesId());
            ordersService.serviceCntInput(serviceCntDto);
            result.put("info", "개수 입력이 완료되었습니다.");
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/input")
    public ResponseEntity<?> listServices(){
        Map<String,Object> result = new HashMap<>();
        List<ServiceDto> serviceDTOS = ordersService.listService();
        result.put("serviceList",serviceDTOS);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }



}