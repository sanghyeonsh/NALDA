package com.a204.nalda.dto.flight;

import com.a204.nalda.domain.enumtype.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightDto {

    private String flightNum;
    private LocalDateTime flightDate;
    private String airplaneKind;
    private String status;
}
