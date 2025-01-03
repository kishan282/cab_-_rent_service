package com.nks.integration;

import com.nks.admin_service.AdminServiceApplication;
import com.nks.admin_service.ServiceController.AdminServiceController;
import com.nks.admin_service.adminservicedto.AddRenterRequest;
import com.nks.admin_service.adminservicedto.AddRenterResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = AdminServiceControllerTest.class)
public class AdminServiceControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    private AddRenterRequest renterRequest;

    private String getBaseUrl() {
        return "http://localhost:9091/admin-service";
    }

    public String getJsonFromFile() throws IOException {
        Path path = Paths.get("src/test/java/resources/addRenterRequestSample.json");
        return new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
    }

    @Test
    public void testGetRequest() {
        ResponseEntity<String> response = restTemplate.getForEntity(getBaseUrl() + "/status", String.class);
        Assertions.assertEquals(HttpStatus.ACCEPTED, response.getStatusCode());
    }

    @Test
    public void testPostRequest() throws IOException {

        HttpEntity<String> request = new HttpEntity<>(getJsonFromFile());
        System.out.println(request);
        ResponseEntity<AddRenterResponse> response = restTemplate.postForEntity(getBaseUrl() + "/add-renter", request, AddRenterResponse.class);

        System.out.println(response);
        Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());


    }

}
