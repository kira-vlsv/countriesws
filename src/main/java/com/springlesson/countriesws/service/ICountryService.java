package com.springlesson.countriesws.service;

import com.springlesson.countriesws.model.Country;

import java.util.List;

public interface ICountryService {

    Country getCountry(String code);

    List<Country> getAllCountries();
}
