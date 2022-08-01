package com.a204.nalda.dto.meal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MealDto {

    private String imageName;
    private String mealMenu;
    private byte[] bytesdata;


}
