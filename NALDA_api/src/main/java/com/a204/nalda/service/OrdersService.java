package com.a204.nalda.service;

import com.a204.nalda.domain.entity.airplane.Flight;
import com.a204.nalda.domain.entity.airplane.Seat;
import com.a204.nalda.domain.entity.inflightservice.*;
import com.a204.nalda.domain.entity.user.User;
import com.a204.nalda.domain.enumtype.Status;
import com.a204.nalda.dto.orders.OrderDto;
import com.a204.nalda.dto.orders.OrderListDto;
import com.a204.nalda.dto.orders.ServiceCntDto;
import com.a204.nalda.dto.orders.ServiceDto;
import com.a204.nalda.repository.OrderListRepository;
import com.a204.nalda.repository.OrderRepository;
import com.a204.nalda.repository.ServiceRepository;
import com.a204.nalda.repository.ServiceStockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersService {

    private final ServiceRepository serviceRepository;
    private final OrderRepository orderRepository;
    private final OrderListRepository orderListRepository;

    private final ServiceStockRepository serviceStockRepository;

    @Transactional
    public List<ServiceDto> servicesByClass(String serviceClass) throws IOException {
        List<ServiceCodes> services = serviceRepository.findByServiceClass(serviceClass);
        List<ServiceDto> serviceDto = new ArrayList<>();
        ByteArrayOutputStream bos;
        String fileName;
        String filePath;
        for (ServiceCodes service : services) {
            bos = new ByteArrayOutputStream();
            fileName = service.getImage();
            filePath = System.getProperty("user.dir")+"/src/main/resources/static/snack/";
            InputStream imageStream = new FileInputStream(filePath + fileName);
            imageStream.transferTo(bos);
            byte[] bytesData = bos.toByteArray();

            serviceDto.add(ServiceDto.builder()
                    .image(service.getImage())
                    .serviceName(service.getServiceName())
                    .serviceCode(service.getCode())
                    .serviceClass(service.getServiceClass())
                    .bytesdata(bytesData)
                    .build());
        }
        return serviceDto;
    }

    @Transactional
    public void orderInput(OrderDto orderdto){

        User user = User.builder()
                .id(orderdto.getUserId())
                .build();
        Flight flight = Flight.builder()
                .id(orderdto.getFlightId())
                .build();
        Seat seat = Seat.builder()
                .id(orderdto.getSeatId())
                .build();
        Status status = Status.valueOf(orderdto.getStatus());

        Orders orders = Orders.builder()
                .orderMessage(orderdto.getOrderMessage())
                .orderTime(orderdto.getOrderTime())
                .flight(flight)
                .seat(seat)
                .user(user)
                .status(status)
                .ordersCodes(new ArrayList<>())
                .build();
        System.out.println(orders.getOrderMessage());
        for(OrderListDto orderList : orderdto.getOrderList()){

            OrdersCodes ordersCodes = OrdersCodes.builder()
                    .orderCode(orderList.getOrderCode())
                    .build();
            orders.addOrdersCode(ordersCodes);
        }
        orderRepository.save(orders);

    }

    public void serviceCntInput(ServiceCntDto serviceCntDto){

        ServiceCodes serviceCodes = ServiceCodes.builder()
                .id(serviceCntDto.getServiceCodesId())
                .build();
        Flight flight = Flight.builder()
                .id(serviceCntDto.getFlightId())
                .build();
        ServiceStock serviceStock = ServiceStock.builder()
                .serviceCodes(serviceCodes)
                .flight(flight)
                .total(serviceCntDto.getTotal())
                .build();

        serviceStockRepository.save(serviceStock);
    }

    @Transactional
    public List<ServiceDto> listService(){

        List<ServiceCodes> serviceCodes = serviceRepository.findAll();
        List<ServiceDto> serviceDto = new ArrayList<>();
        for(ServiceCodes serviceCode:serviceCodes){
            serviceDto.add(ServiceDto.builder()
                    .image("")
                    .serviceName(serviceCode.getServiceName())
                    .serviceCode(serviceCode.getCode())
                    .serviceClass(serviceCode.getServiceClass())
                    .build());
        }
        return serviceDto;
    }


}
