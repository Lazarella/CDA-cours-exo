package com.example.crypto_market.entity;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Random;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CryptoCurrency {

    @Id
     private Long cryptoID;
    private String cryptoName;
    @Size(min = 3, max=5)
    private String cryptoNameShort;
    private Double price;
    private Double fluctuationPerHour;
    private Double fluctuationPerDay;
    private Double fluctuationPerWeek;
    private Double marketCap;
    private Double dailyVolume;

}
