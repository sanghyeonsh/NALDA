package com.a204.nalda_api.domain.entity;

import com.a204.nalda_api.domain.enumtype.SnackClassification;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Snack {
    @Id
    @GeneratedValue
    @Column(name = "snack_id")
    private Long id;

    @Column(name = "service_code")
    private String serviceCode;

    @Column(name = "snack_name")
    private String snackName;

    @Column(name = "image_name")
    private String imageName;

    @Enumerated(EnumType.STRING)
    private SnackClassification snackClassification;

}
