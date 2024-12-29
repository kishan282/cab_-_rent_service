package com.nks.admin_service.adminservicedto;

import org.springframework.stereotype.Component;

@Component
public final class AddRenterResponse {

    private final String renterInternalId;
    private final String message;

    public String getRenterInternalId() {
        return renterInternalId;
    }

    public String getMessage() {
        return message;
    }

    public AddRenterResponse(String renterInternalId) {
        this.renterInternalId = renterInternalId;
        this.message =  "User has been added successfully";
    }
}
