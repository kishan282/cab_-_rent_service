package com.nks.admin_service.adminservice;

import com.nks.admin_service.adminservicedto.AddRenterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainBuissnessService {

    public AddRenterResponse addRenter(){
        return new AddRenterResponse();
    }

}
