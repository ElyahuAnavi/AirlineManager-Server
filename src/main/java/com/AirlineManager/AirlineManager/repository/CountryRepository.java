package com.AirlineManager.AirlineManager.repository;

import com.AirlineManager.AirlineManager.model.Country;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CountryRepository extends MongoRepository<Country, String> {}
