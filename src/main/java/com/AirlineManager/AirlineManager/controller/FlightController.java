package com.AirlineManager.AirlineManager.controller;

import com.AirlineManager.AirlineManager.model.Flight;
import com.AirlineManager.AirlineManager.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights() {
        return flightService.getAllFlights();
    }

    @GetMapping("/{id}")
    public Flight getFlightById(@PathVariable String id) {
        return flightService.getFlightById(id);
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight) {
        return flightService.saveFlight(flight);
    }

    @DeleteMapping("/{id}")
    public void deleteFlight(@PathVariable String id) {
        flightService.deleteFlight(id);
    }
}
