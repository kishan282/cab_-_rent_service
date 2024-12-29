package com.nks.admin_service.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import javax.annotation.Generated;
import java.util.Date;

@Document(collection = "renters_details")
public final class RenterEntity {

    @MongoId
    private final String renterInternalId;
    private final Date bookingDate;
    private final String phoneNumber;
    private final String driverLicense;
    private final String renterName;
    private final boolean isLive;
    private final boolean isActive;
    private final String carNumber;

    public RenterEntity(String renterInternalId, Date bookingDate, String phoneNumber,
                        String driverLicense, String renterName, boolean isLive,
                        boolean isActive, String carNumber) {
        this.renterInternalId = renterInternalId;
        this.bookingDate = bookingDate;
        this.phoneNumber = phoneNumber;
        this.driverLicense = driverLicense;
        this.renterName = renterName;
        this.isLive = isLive;
        this.isActive = isActive;
        this.carNumber = carNumber;
    }

}
