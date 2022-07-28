package com.a204.nalda.dto.customdeclaration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VisitedCountryDTO {
    private Long id;
    private String countryName;
}
