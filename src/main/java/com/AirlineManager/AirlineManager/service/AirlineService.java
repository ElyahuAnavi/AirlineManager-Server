package com.AirlineManager.AirlineManager.service;

import com.AirlineManager.AirlineManager.model.Airline;
import com.AirlineManager.AirlineManager.repository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirlineService {
    @Autowired
    private AirlineRepository airlineRepository;

    public List<Airline> getAllAirlines() {
        return airlineRepository.findAll();
    }

    public Airline getAirlineById(String id) {
        return airlineRepository.findById(id).orElse(null);
    }

    public Airline saveAirline(Airline airline) {
        return airlineRepository.save(airline);
    }

    public void deleteAirline(String id) {
        airlineRepository.deleteById(id);
    }
}
