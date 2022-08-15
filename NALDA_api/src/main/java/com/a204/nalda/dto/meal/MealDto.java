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
public class MealDto {

    private Long mealId;
    private String imageName;
    private String mealMenu;
    private String content;
    private byte[] bytesdata;
    private Status status;


}
