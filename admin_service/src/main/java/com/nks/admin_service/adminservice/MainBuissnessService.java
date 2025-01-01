package com.nks.admin_service.adminservice;

import com.nks.admin_service.adminservicedto.AddRenterRequest;
import com.nks.admin_service.adminservicedto.AddRenterResponse;
import com.nks.admin_service.helpre_utils.IdCreationLogicUtils;
import com.nks.admin_service.models.RenterEntity;
import com.nks.admin_service.models.SignUpEntity;
import com.nks.admin_service.repository.RenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainBuissnessService {

    @Autowired
    private IdCreationLogicUtils idCreationLogicUtils;

    @Autowired
    private RenterRepository renterRepository;

    public AddRenterResponse addRenter(AddRenterRequest addRenterRequest){
        String renterInternalId = idCreationLogicUtils.idCreationLogic(addRenterRequest.getUserDetails().getName());
        String bookingId = idCreationLogicUtils.renterBookingId(addRenterRequest.getUserDetails().getName());

        final RenterEntity renterEntity = new RenterEntity(bookingId, addRenterRequest.getBookingDateTime(), addRenterRequest.getUserDetails().getPhoneNumber(),
                addRenterRequest.isLive(), addRenterRequest.isActive(), addRenterRequest.getCarNumber());

        // SignUpEntity will be connected to oracle-db and maybe merge in different service called identity-service
        final SignUpEntity signUpEntity = new SignUpEntity(renterInternalId,
                addRenterRequest.getUserDetails().getName(),
                addRenterRequest.getUserDetails().getRole(),
                addRenterRequest.getUserDetails().getPhoneNumber(),
                addRenterRequest.getDriverLicense());

        renterRepository.save(renterEntity);
        return new AddRenterResponse(renterInternalId);
    }

}
