package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Medical {
    @Id
    @GeneratedValue
    @Column(name = "medical_id")
    private Long id;

    @Column(name = "service_code")
    private String serviceCode;

    @Column(name = "medical_name")
    private String medicalName;
}
