package com.a204.nalda.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class ServiceCodes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_codes_id")
    private Long id;

    private String code;

    @Column(name = "service_class")
    private String serviceClass;

    @Column(name = "service_name")
    private String serviceName;

    private String image;
}
