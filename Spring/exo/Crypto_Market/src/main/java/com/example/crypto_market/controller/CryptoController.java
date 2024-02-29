package com.example.crypto_market.controller;

import com.example.crypto_market.dto.CryptoCurrencyDTO;
import com.example.crypto_market.entity.CryptoCurrency;
import com.example.crypto_market.service.CryptoService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("home")
public class CryptoController {
    private final CryptoService cryptoService;

    public CryptoController( CryptoService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @PostMapping
    public void post(@RequestBody CryptoCurrencyDTO cryptoCurrencyDTO) {
        cryptoService.submit(convertToEntity(cryptoCurrencyDTO));
    }

    @RequestMapping("/cryptos")
    @GetMapping
    public Flux<List<CryptoCurrencyDTO>> getAll(){
        return cryptoService.getAll()
                .map(entity -> Collections.singletonList(cryptoService.convertToDTO(entity)));
    }
    private CryptoCurrency convertToEntity(CryptoCurrencyDTO cryptoCurrencyDTO){
return null;
    }
}
