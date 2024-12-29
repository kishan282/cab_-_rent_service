package com.nks.admin_service.adminservicedto;

import org.springframework.stereotype.Component;

public final class AddRenterResponse {

    private final String renterInternalId;
    private final String message;


    public AddRenterResponse() {
        this.renterInternalId = "Kishan3176";
        this.message =  "User has been added successfully";
    }
}
