package com.springlesson.countriesws.controller;

import com.springlesson.countriesws.model.Country;
import com.springlesson.countriesws.service.ICountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountriesController {

    private final ICountryService countryService;

    @Autowired
    public CountriesController(ICountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country")
    public String getCountryByCode(@RequestParam String code) {
        return countryService.getCountry(code).getName();
    }

    @GetMapping("/countries")
    public List<Country> findAllCountries() {
        return countryService.getAllCountries();
    }
}
