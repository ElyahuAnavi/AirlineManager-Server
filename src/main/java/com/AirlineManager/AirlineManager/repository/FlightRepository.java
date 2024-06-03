package com.AirlineManager.AirlineManager.repository;

import com.AirlineManager.AirlineManager.model.Flight;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlightRepository extends MongoRepository<Flight, String> {}
