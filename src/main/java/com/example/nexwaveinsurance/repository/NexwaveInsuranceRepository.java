package com.example.nexwaveinsurance.repository;

import com.example.nexwaveinsurance.entity.RegisterForm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NexwaveInsuranceRepository extends MongoRepository<RegisterForm,String > {

}
