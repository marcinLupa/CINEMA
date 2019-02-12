package com.marcin_lupa.json.impl;

import com.marcin_lupa.json.JsonConverter;
import com.marcin_lupa.model.Movie;

public class MovieConverter  extends JsonConverter<Movie> {
    public MovieConverter(String jsonFilename) {
        super(jsonFilename);
    }
}
