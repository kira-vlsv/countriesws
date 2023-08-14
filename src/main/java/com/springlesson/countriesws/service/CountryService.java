package com.springlesson.countriesws.service;

import com.springlesson.countriesws.model.Country;
import com.springlesson.countriesws.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService implements ICountryService {

    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    @Override
    public Country getCountry(String code) {
        return Country.fromEntity(countryRepository.getByCode(code));
    }

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll()
                .stream().map(Country::fromEntity)
                .toList();
    }
}
