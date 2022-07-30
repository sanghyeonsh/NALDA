package com.a204.nalda.dto.user;

import com.a204.nalda.domain.embedded.Address;
import com.a204.nalda.domain.enumtype.Gender;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class UserDetailDto {

    private String job;
    private String passportNum;
    private Address address;
    private String tel;
    private String email;
    private Gender gender;
    private String nationality;

}
