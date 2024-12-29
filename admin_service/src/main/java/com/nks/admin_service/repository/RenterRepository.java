package com.nks.admin_service.repository;


import com.nks.admin_service.models.RenterEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterRepository extends MongoRepository<RenterEntity, String> {

}
