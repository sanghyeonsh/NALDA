package com.a204.nalda_api.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Address {

    private String zipcode;
    @Column(name = "main_address")
    private String mainAddress;
    @Column(name = "detail_address")
    private String detailAddress;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(getZipcode(), address.getZipcode()) && Objects.equals(getMainAddress(), address.getMainAddress()) && Objects.equals(getDetailAddress(), address.getDetailAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getZipcode(), getMainAddress(), getDetailAddress());
    }
}
