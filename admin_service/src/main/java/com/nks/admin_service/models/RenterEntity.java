package com.nks.admin_service.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.annotation.Generated;
import java.util.Date;

@Document(collection = "renters_details")
public final class RenterEntity {

    @Id()
    private final String id;
    private final Date bookingDate;
    private final String phoneNumber;
    private final boolean isLive;
    private final boolean isActive;
    private final String carNumber;

    public RenterEntity(String id, Date bookingDate, String phoneNumber, boolean isLive,
                        boolean isActive, String carNumber) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.phoneNumber = phoneNumber;
        this.isLive = isLive;
        this.isActive = isActive;
        this.carNumber = carNumber;
    }

}
