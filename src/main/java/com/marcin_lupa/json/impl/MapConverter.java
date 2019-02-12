package com.marcin_lupa.json.impl;

import com.marcin_lupa.json.JsonConverter;

import java.util.Map;

public class MapConverter extends JsonConverter<Map> {
    public MapConverter(String jsonFilename) {
        super(jsonFilename);
    }
}
