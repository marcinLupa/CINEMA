package com.marcin_lupa.json.impl;

import com.marcin_lupa.json.JsonConverter;
import com.marcin_lupa.model.SalesStand;

import java.util.List;

public class SalesStandListConverter extends JsonConverter<List<SalesStand>> {
    public SalesStandListConverter(String jsonFilename) {
        super(jsonFilename);
    }
}
