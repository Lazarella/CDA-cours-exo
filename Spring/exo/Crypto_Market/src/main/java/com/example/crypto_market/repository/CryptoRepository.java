package com.example.crypto_market.repository;

import com.example.crypto_market.dto.CryptoCurrencyDTO;
import com.example.crypto_market.entity.CryptoCurrency;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CryptoRepository extends R2dbcRepository<CryptoCurrency, Long> {

}
