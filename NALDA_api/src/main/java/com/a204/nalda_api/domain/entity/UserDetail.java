package com.a204.nalda_api.domain.entity;

import com.a204.nalda_api.domain.embedded.Address;
import com.a204.nalda_api.domain.enumtype.Sex;
import com.a204.nalda_api.domain.enumtype.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetail {

    @Id
    @GeneratedValue
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
    private Sex sex;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;
    private String nationality;

    @OneToOne(mappedBy = "userDetail")
    private User user;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "terms_id")
    private Terms terms;

}
