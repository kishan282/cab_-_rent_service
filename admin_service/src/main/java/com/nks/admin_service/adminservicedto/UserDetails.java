package com.nks.admin_service.adminservicedto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class UserDetails {

    private final String name;
    private final String role;
    private final String phoneNumber;

    @JsonCreator
    public UserDetails(@JsonProperty("name") String name,
                       @JsonProperty("role") String role,
                       @JsonProperty("phone_number") String phoneNumber) {
        this.name = name;
        this.role = role;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}
