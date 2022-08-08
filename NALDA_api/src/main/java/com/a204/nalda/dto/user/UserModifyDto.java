package com.a204.nalda.dto.user;

import com.a204.nalda.domain.embedded.Address;
import com.a204.nalda.domain.embedded.FullName;
import com.a204.nalda.domain.enumtype.Gender;
import lombok.Data;

import java.time.LocalDate;

@Data
public class UserModifyDto {

    private String username;
    private String password;
    private LocalDate birthday;
    private FullName fullName;
    private String job;
    private String passportNum;
    private Address address;
    private String tel;
    private String email;
    private Gender gender;
    private String nationality;
}
