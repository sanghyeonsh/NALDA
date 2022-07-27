package com.a204.nalda.dto.meal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeatMealDto {

    private Long flightId;
    private Long mealId;
    private Long seatId;
    private Long userId;


}
