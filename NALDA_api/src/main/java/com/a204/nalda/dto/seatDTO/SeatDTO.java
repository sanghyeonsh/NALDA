package com.a204.nalda.dto.seatDTO;

import com.a204.nalda.domain.enumtype.SeatClass;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatDTO {

    private String seatNum;
    private SeatClass seatClass;
    private String airplaneKind;
}
