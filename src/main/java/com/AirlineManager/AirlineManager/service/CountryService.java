package com.AirlineManager.AirlineManager.service;

import com.AirlineManager.AirlineManager.model.Country;
import com.AirlineManager.AirlineManager.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    public Country getCountryById(String id) {
        return countryRepository.findById(id).orElse(null);
    }

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    public void deleteCountry(String id) {
        countryRepository.deleteById(id);
    }
}
