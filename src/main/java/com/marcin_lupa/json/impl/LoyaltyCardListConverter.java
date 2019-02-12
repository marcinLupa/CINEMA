package com.marcin_lupa.json.impl;

import com.marcin_lupa.json.JsonConverter;
import com.marcin_lupa.model.LoyaltyCard;

import java.util.List;

public class LoyaltyCardListConverter extends JsonConverter<List<LoyaltyCard>> {
    public LoyaltyCardListConverter(String jsonFilename) {
        super(jsonFilename);
    }
}
