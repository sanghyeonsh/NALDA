package com.a204.nalda.dto.inflightservice;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ToiletDTO {
    private String toiletCode;
    private int used;
}
