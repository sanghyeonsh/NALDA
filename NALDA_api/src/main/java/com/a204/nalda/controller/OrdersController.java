package com.a204.nalda.controller;


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
        List<byte[]> images = new ArrayList<>();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        try {
            List<ServiceDto> serviceDTOS = ordersService.listService(serviceClass);
            String fileName;
            String filePath;
            for (ServiceDto serviceDTO : serviceDTOS) {
                fileName = serviceDTO.getImage();
                filePath = System.getProperty("user.dir")+"/src/main/resources/static/snack/";
                InputStream imageStream = new FileInputStream(filePath + fileName);
                imageStream.transferTo(bos);
                byte[] bytesData = bos.toByteArray();
                images.add(bytesData);
            }
            result.put("service",serviceDTOS);
            result.put("images", images);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            result.put("msg", e.getMessage());
            return new ResponseEntity<>(result, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


//    @PostMapping("/submit")
//    public ResponseEntity<?> submitOrders(@RequestBody Orders orders){
//
//
//
//    }





}