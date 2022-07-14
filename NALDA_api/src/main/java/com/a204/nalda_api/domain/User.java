package com.a204.nalda_api.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String username;
    private String password;

    @Embedded
    private FullName fullName;

    @Embedded
    private Birthday birthday;

    @Column(name="passport_num")
    private String passportNum;

    private String job;

    @Embedded
    private Address address;

    private String tell;
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<CustomsDeclaration> customsDeclarations = new ArrayList<>();

    //연관 관계 메소드
    public void addCustomsDeclarations(CustomsDeclaration customsDeclaration) {
        customsDeclarations.add(customsDeclaration);
        customsDeclaration.setUser(this);
    }

}
