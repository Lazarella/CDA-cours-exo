package com.example.crypto_market.service;


import com.example.crypto_market.dto.CryptoCurrencyDTO;
import com.example.crypto_market.entity.CryptoCurrency;
import com.example.crypto_market.repository.CryptoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.Random;

@Service
public class CryptoService {

    public final WebClient webClient;
    private final CryptoRepository cryptoRepository;
    private final ModelMapper modelMapper;
    private Random random;


    public CryptoService(CryptoRepository cryptoRepository, ModelMapper modelMapper) {
        this.cryptoRepository = cryptoRepository;
        this.modelMapper = modelMapper;
        webClient = WebClient.builder().baseUrl("\"http://localhost:8080/\"").build();
        random = new Random();
    }
    public Flux<CryptoCurrencyDTO> getAll() {
        return webClient.get().uri("/cryptos").retrieve().bodyToFlux(CryptoCurrencyDTO.class);
    }


    public CryptoCurrencyDTO convertToDTO(CryptoCurrencyDTO crypto){
        ModelMapper modelMapper = new ModelMapper();
       return modelMapper.map(crypto, CryptoCurrencyDTO.class);
    }
    public CryptoCurrency convertToEntity(CryptoCurrencyDTO cryptoDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(cryptoDTO, CryptoCurrency.class);
    }
    public Double getRandom(Double d){
        return new Random().nextDouble() * d;
    }

    public void submit(CryptoCurrency cryptoCurrency) {
    }
}
