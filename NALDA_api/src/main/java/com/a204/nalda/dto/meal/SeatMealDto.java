package com.a204.nalda.dto.meal;

import com.a204.nalda.domain.enumtype.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SeatMealDto {

    private Status status;
    private String flightNum;
    private String mealMenu;
    private String seatNum;
    private String username;


}
