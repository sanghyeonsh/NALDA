package com.a204.nalda.dto.orders;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private String orderMessage;
    private LocalDateTime orderTime;
    private Long flightId;
    private Long seatId;
    private Long userId;

    @Enumerated(EnumType.STRING)
    private String status;

    private List<OrderListDto> orderList;

}
