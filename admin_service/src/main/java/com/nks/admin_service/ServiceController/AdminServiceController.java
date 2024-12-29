package com.nks.admin_service.ServiceController;

import com.nks.admin_service.adminservice.MainBuissnessService;
import com.nks.admin_service.adminservicedto.AddRenterRequest;
import com.nks.admin_service.adminservicedto.AddRenterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin-service")
public class AdminServiceController {

    @Autowired
    private MainBuissnessService mainBuissnessService;

    @RequestMapping(method = RequestMethod.GET, value = "/status")
    public ResponseEntity<String> getStatus(){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body("Success");
    }

    @RequestMapping(method = RequestMethod.GET, value = "add-renter")
    public ResponseEntity<?> addRenter() {
        AddRenterResponse addRenterResponse = mainBuissnessService.addRenter();
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
