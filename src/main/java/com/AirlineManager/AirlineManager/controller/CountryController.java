package com.AirlineManager.AirlineManager.controller;

import com.AirlineManager.AirlineManager.model.Country;
import com.AirlineManager.AirlineManager.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/countries")
public class CountryController {
    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    @GetMapping("/{id}")
    public Country getCountryById(@PathVariable String id) {
        return countryService.getCountryById(id);
    }

    @PostMapping
    public Country createCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    @DeleteMapping("/{id}")
    public void deleteCountry(@PathVariable String id) {
        countryService.deleteCountry(id);
    }
}
