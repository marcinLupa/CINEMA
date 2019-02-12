package com.marcin_lupa.json.impl;

import com.marcin_lupa.json.JsonConverter;
import com.marcin_lupa.model.Customer;

import java.util.List;

public class CustomerListConverter extends JsonConverter<List<Customer>> {
    public CustomerListConverter(String jsonFilename) {
        super(jsonFilename);
    }
}
