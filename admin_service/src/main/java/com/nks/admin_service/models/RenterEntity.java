package com.nks.admin_service.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.annotation.Generated;
import java.util.Date;

@Document(collection = "renter_detail")
public final class RenterEntity {

    @Id()
    private final String id;
    private final String phoneNumber;
    private final boolean isActive;
    private final String carNumber;

    public RenterEntity(String id, String phoneNumber,
                        boolean isActive, String carNumber) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.isActive = isActive;
        this.carNumber = carNumber;
    }

}
