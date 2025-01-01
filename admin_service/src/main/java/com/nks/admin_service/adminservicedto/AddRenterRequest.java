package com.nks.admin_service.adminservicedto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public final class AddRenterRequest {

    @JsonCreator
    public AddRenterRequest(@JsonProperty("car_number") String carNumber,
                            @JsonProperty("is_live") boolean isLive,
                            @JsonProperty("is_active") boolean isActive,
                            @JsonProperty("driver_licence") String driverLicense,
                            @JsonProperty("user_details") UserDetails userDetails) {
        this.carNumber = carNumber;
        this.isLive = isLive;
        this.isActive = isActive;
        this.driverLicense = driverLicense;
        this.userDetails = userDetails;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public boolean isLive() {
        return isLive;
    }

    public boolean isActive() {
        return isActive;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    private String carNumber;
    private boolean isLive; // ( if this request is for cab service)
    //if isLisve=true then bookingDateAndTime, pickup, drop, seats
    private boolean isActive; //( if yes, then it will make that renter available for the day or closed and also this will make the driver be on the list of user renter search)
    private String driverLicense; // or validate licence
    // have to add driverlicence pic
    private UserDetails userDetails;



}
