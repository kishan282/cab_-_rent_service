package com.nks.admin_service.adminservicedto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

import java.util.Date;

public class AddRenterRequest {
    public Date getBookingDateTime() {
        return bookingDateTime;
    }

    @JsonCreator
    public AddRenterRequest(@JsonProperty("booking_date") Date bookingDateTime,
                            @JsonProperty("car_number") String carNumber,
                            @JsonProperty("is_live") boolean isLive,
                            @JsonProperty("name") String renterName,
                            @JsonProperty("is_active") boolean isActive,
                            @JsonProperty("phone_number") String phoneNumber,
                            @JsonProperty("driver_licence") String driverLicense) {
        this.bookingDateTime = bookingDateTime;
        this.carNumber = carNumber;
        this.isLive = isLive;
        this.renterName = renterName;
        this.isActive = isActive;
        this.phoneNumber = phoneNumber;
        this.driverLicense = driverLicense;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public boolean isLive() {
        return isLive;
    }

    public String getRenterName() {
        return renterName;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    private Date bookingDateTime; // remove
    private String carNumber;
    private boolean isLive; // ( if this request is for cab service)
    //if isLisve=true then bookingDateAndTime, pickup, drop, seats
    private String renterName;
    private boolean isActive; //( if yes, then it will make that renter available for the day or closed and also this will make the driver be on the list of user renter search)
    private String phoneNumber;
    private String driverLicense; // or validate licence
    // have to add driverlicence pic

}
