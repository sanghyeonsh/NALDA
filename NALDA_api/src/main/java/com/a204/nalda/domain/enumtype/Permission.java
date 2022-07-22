package com.a204.nalda.domain.enumtype;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum Permission {
    Y("Y"),N("N");

    @Getter
    private final String value;

    Permission(String value) {
        this.value = value;
    }

    @JsonCreator
    public static Permission from(String value) {
        for(Permission permission : Permission.values()) {
            if(permission.getValue().equals(value)) {
                return permission;
            }
        }
        return null;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
