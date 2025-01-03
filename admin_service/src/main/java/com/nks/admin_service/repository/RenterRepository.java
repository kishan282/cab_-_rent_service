package com.nks.admin_service.repository;


import com.nks.admin_service.models.RenterEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

public interface RenterRepository extends MongoRepository<RenterEntity, String> {

}
