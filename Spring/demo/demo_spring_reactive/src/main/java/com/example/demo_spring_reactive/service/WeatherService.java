package com.example.demo_spring_reactive.service;

import com.example.demo_spring_reactive.model.Weather;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Sinks;



@RestController
public class WeatherService {
    private final WebClient webClient;


    public WeatherService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://weatherapi").build();
    }

    public Flux<String> getWeather() {
        return this.webClient.get()
                .uri("/latestWeather")
                .retrieve()
                .bodyToFlux(String.class);
    }
    public Flux<String> getWeatherByCity(String city) {
        return this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/topNews/{city}").build(city))
                .retrieve()
                .bodyToFlux(String.class);
    }
}
