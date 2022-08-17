package com.a204.nalda.controller;


import com.a204.nalda.domain.entity.inflightservice.ServiceStock;
import com.a204.nalda.dto.orders.OrderCntDto;
import com.a204.nalda.dto.orders.OrderDto;
import com.a204.nalda.dto.orders.ServiceCntDto;
import com.a204.nalda.dto.orders.ServiceDto;
import com.a204.nalda.service.OrdersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/count/{flightNum}")
    public ResponseEntity<?> getServicesCnt(@PathVariable("flightNum") String flightNum) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<ServiceCntDto> serviceStocks = ordersService.serviceCnt(flightNum);
            result.put("cntList",serviceStocks);
            return new ResponseEntity<>(result,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/input")
    public ResponseEntity<?> selectServices(@RequestBody List<ServiceCntDto> serviceCntDTOS){
        Map<String,Object> result = new HashMap<>();
        try {
            ordersService.serviceCntInput(serviceCntDTOS);
            result.put("info", "개수 입력이 완료되었습니다.");
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e){
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/input")
    public ResponseEntity<?> modifyServices(@RequestBody List<ServiceCntDto> serviceCntDTOS){
        Map<String,Object> result = new HashMap<>();
        try {
            ordersService.updateServiceCnt(serviceCntDTOS);
            result.put("info", "개수 수정이 완료되었습니다.");
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
        try{
            List<ServiceDto> serviceDTOS = ordersService.listService();
            result.put("serviceList",serviceDTOS);
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg",e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/input/{flightNum}")
    public ResponseEntity<?> listOrders(@PathVariable("flightNum") String flightNum){
        Map<String,Object> result = new HashMap<>();
        try{
            List<OrderDto> orderDTOS = ordersService.listOrders(flightNum);
            result.put("serviceList",orderDTOS);
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg",e.getMessage());
            return new ResponseEntity<>(result,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/status/{ordersId}")
    public ResponseEntity<?> updateStatus(@PathVariable("ordersId") Long ordersId){
        Map<String,Object> result = new HashMap<>();
        try{
            ordersService.updateStatus(ordersId);
            result.put("msg","변경 성공");
            return new ResponseEntity<>(result, HttpStatus.OK);
        }catch (Exception e){
            e.printStackTrace();
            result.put("msg",e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/total/{flightNum}")
    public ResponseEntity<?> getOrdersCnt(@PathVariable("flightNum") String flightNum) {
        Map<String, Object> result = new HashMap<>();
        try {
            List<OrderCntDto> orderCntDTOS = ordersService.orderCnt(flightNum);
            result.put("orderCnt",orderCntDTOS);
            return new ResponseEntity<>(result,HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}