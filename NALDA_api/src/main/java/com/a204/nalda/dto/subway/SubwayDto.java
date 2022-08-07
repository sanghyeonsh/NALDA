package com.a204.nalda.dto.subway;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubwayDto {

    private String name;
    private LocalDateTime time;
    private String end;
    private String dayCode;


}
