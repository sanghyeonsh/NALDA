package com.a204.nalda.domain.entity;

import com.a204.nalda.domain.embedded.Address;
import com.a204.nalda.domain.enumtype.Gender;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_detail_id")
    private Long id;

    private String job;

    @Column(name = "passport_num")
    private String passportNum;

    @Embedded
    private Address address;
    private String tel;
    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String nationality;

}
