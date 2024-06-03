package com.AirlineManager.AirlineManager.repository;


import com.AirlineManager.AirlineManager.model.Airline;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AirlineRepository extends MongoRepository<Airline, String> {}
