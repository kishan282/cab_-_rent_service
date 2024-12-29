package com.nks.admin_service.adminservice;

import com.nks.admin_service.adminservicedto.AddRenterRequest;
import com.nks.admin_service.adminservicedto.AddRenterResponse;
import com.nks.admin_service.helpre_utils.IdCreationLogicUtils;
import com.nks.admin_service.models.RenterEntity;
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
        String renterInternalId = idCreationLogicUtils.idCreationLogic(addRenterRequest.getRenterName());
        final RenterEntity renterEntity = new RenterEntity(renterInternalId, addRenterRequest.getBookingDateTime(), addRenterRequest.getPhoneNumber(),
                addRenterRequest.getDriverLicense(), addRenterRequest.getRenterName(),
                addRenterRequest.isLive(), addRenterRequest.isActive(), addRenterRequest.getCarNumber());
        renterRepository.save(renterEntity);
        return new AddRenterResponse(renterInternalId);
    }

}
