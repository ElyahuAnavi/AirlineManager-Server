package com.AirlineManager.AirlineManager.controller;

import com.AirlineManager.AirlineManager.model.Airline;
import com.AirlineManager.AirlineManager.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airlines")
public class AirlineController {
    @Autowired
    private AirlineService airlineService;

    @GetMapping
    public List<Airline> getAllAirlines() {
        return airlineService.getAllAirlines();
    }

    @GetMapping("/{id}")
    public Airline getAirlineById(@PathVariable String id) {
        return airlineService.getAirlineById(id);
    }

    @PostMapping
    public Airline createAirline(@RequestBody Airline airline) {
        return airlineService.saveAirline(airline);
    }

    @DeleteMapping("/{id}")
    public void deleteAirline(@PathVariable String id) {
        airlineService.deleteAirline(id);
    }
}
