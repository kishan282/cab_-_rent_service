package com.nks.admin_service.adminservicedto;

import java.util.Date;

public class AddRenterRequest {

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
