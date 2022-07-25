package com.a204.nalda.dto.customdeclaration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlcoholsDTO {

    private Long id;
    private int num;
    private float liter;
    private float dollar;

}
