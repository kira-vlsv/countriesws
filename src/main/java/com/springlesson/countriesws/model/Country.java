package com.springlesson.countriesws.model;

import com.springlesson.countriesws.model.entity.CountryEntity;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Country {

    private String name;
    private String code;

    public static Country fromEntity(CountryEntity entity) {
        return new Country().setName(entity.getName())
                .setCode(entity.getCode());
    }
}
