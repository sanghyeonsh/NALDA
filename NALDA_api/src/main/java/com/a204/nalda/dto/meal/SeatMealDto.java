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

    private String flightNum;
    private String mealMenu;
    private String seatNum;
    private String username;


}
