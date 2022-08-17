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
public class MealStockDto {

    private String imageName;
    private String mealMenu;
    private int total;
    private Status status;

}
