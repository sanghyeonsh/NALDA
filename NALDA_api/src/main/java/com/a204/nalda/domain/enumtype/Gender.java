package com.a204.nalda.domain.enumtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum Gender {
    MALE("MALE"),FEMALE("FEMALE");

    @Getter
    private final String value;

    Gender(String value) {
        this.value = value;
    }

    @JsonCreator
    public static Gender from(String value) {
        for(Gender gender : Gender.values()) {
            if(gender.getValue().equals(value)) {
                return gender;
            }
        }
        return null;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
