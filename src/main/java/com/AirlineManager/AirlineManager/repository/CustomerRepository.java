package com.AirlineManager.AirlineManager.repository;

import com.AirlineManager.AirlineManager.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {}
