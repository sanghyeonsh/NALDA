package com.a204.nalda.dto.user;

import com.a204.nalda.domain.enumtype.Gender;
import com.a204.nalda.domain.enumtype.Permission;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class JoinDto {
    private String username;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;
    private String job;
    private String passportNum;
    private String zipcode;
    private String mainAddress;
    private String detailAddress;
    private String tel;
    private String email;
    private Gender gender;
    private String nationality;
    private Permission termService;
    private Permission privacyPolicy;
    private Permission locationBased;
    private Permission promotionalInfo;
}
