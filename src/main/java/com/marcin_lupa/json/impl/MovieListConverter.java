package com.marcin_lupa.json.impl;

import com.marcin_lupa.json.JsonConverter;
import com.marcin_lupa.model.Movie;

import java.util.List;

public class MovieListConverter extends JsonConverter<List<Movie>> {
    public MovieListConverter(String jsonFilename) {
        super(jsonFilename);
    }
}
