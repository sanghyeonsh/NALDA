package com.a204.nalda.service;

import com.a204.nalda.domain.entity.inflightservice.ServiceCodes;
import com.a204.nalda.dto.orders.ServiceDto;
import com.a204.nalda.repository.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersService {

    private final ServiceRepository serviceRepository;

    @Transactional
    public List<ServiceDto> listService(String serviceClass){
        List<ServiceCodes> services = serviceRepository.findByServiceClass(serviceClass);
        List<ServiceDto> serviceDto = new ArrayList<>();
        for (ServiceCodes service : services) {
            serviceDto.add(ServiceDto.builder()
                    .image(service.getImage())
                    .serviceName(service.getServiceName())
                    .serviceClass(service.getServiceClass())
                    .build());
        }
        return serviceDto;
    }


}
