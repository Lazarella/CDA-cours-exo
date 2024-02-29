package com.example.crypto_market.dto;

import lombok.Data;
import lombok.Value;

import java.io.Serializable;
import java.util.Random;

/**
 * DTO for {@link com.example.crypto_market.entity.CryptoCurrency}
 */
@Value
public class CryptoCurrencyDTO implements Serializable {



    String cryptoName;
    String cryptoNameShort;
    Double price;
    Double fluctuationPerHour;
    Double fluctuationPerDay;
    Double fluctuationPerWeek;
    Double marketCap;
    Double dailyVolume;

    public void setPrice(double d) {
    }
}