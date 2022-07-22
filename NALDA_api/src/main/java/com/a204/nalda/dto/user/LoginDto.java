package com.a204.nalda.dto.user;

import com.a204.nalda.domain.embedded.FullName;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
@Builder
public class LoginDto {
    private String username;
    private FullName fullName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
}
