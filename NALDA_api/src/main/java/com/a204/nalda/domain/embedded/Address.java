package com.a204.nalda.domain.embedded;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode
public class Address {

    private String zipcode;

    @Column(name = "main_address")
    private String mainAddress;

    @Column(name = "detail_address")
    private String detailAddress;

    @Builder
    public Address(String zipcode, String mainAddress, String detailAddress) {
        this.zipcode = zipcode;
        this.mainAddress = mainAddress;
        this.detailAddress = detailAddress;
    }

}
