package com.springlesson.countriesws.repository;

import com.springlesson.countriesws.model.entity.CountryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface CountryRepository extends CrudRepository<CountryEntity, UUID> {

    CountryEntity getByCode(String code);

    List<CountryEntity> findAll();

}
