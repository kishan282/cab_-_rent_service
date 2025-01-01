package com.nks.admin_service.models;

import org.springframework.data.mongodb.core.mapping.MongoId;

public class SignUpEntity {

    @MongoId
    private final String renterInternalId;
    private final String name;
    private final String role;
    private final String phoneNumber;
    private final String govermentId;

    public SignUpEntity(String renterInternalId, String name, String role,
                        String phoneNumber, String govermentId) {
        this.renterInternalId = renterInternalId;
        this.name = name;
        this.role = role;
        this.phoneNumber = phoneNumber;
        this.govermentId = govermentId;
    }
}
