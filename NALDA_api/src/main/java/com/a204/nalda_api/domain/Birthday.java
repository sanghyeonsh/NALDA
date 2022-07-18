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
public class Birthday {

    @Column(name="birth_day")
    private String birthDay;

    @Column(name="birth_month")
    private String birthMonth;

    @Column(name="birth_year")
    private String birthYear;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birthday birthday = (Birthday) o;
        return Objects.equals(getBirthDay(), birthday.getBirthDay()) && Objects.equals(getBirthMonth(), birthday.getBirthMonth()) && Objects.equals(getBirthYear(), birthday.getBirthYear());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBirthDay(), getBirthMonth(), getBirthYear());
    }
}
