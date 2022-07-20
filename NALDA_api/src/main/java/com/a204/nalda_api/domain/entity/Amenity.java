package com.a204.nalda_api.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Amenity {

    @Id
    @GeneratedValue
    @Column(name = "amenity_id")
    private Long id;

    @Column(name = "service_code")
    private String serviceCode;

    @Column(name = "amenity_name")
    private String amenityName;
}
