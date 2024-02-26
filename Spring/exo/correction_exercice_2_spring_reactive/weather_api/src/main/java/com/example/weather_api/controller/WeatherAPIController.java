package com.example.weather_api.controller;


import com.example.weather_api.entity.WeatherForecast;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Random;

@RequestMapping("weather")
@RestController
public class WeatherAPIController {

    private final Random random;

    public WeatherAPIController() {
        random = new Random();
    }

    @GetMapping("/{city}")
    public Mono<WeatherForecast> get(String city) {
        return Mono.just(WeatherForecast.builder().city(city).temperature(random.nextDouble()).build());
    }
    @GetMapping("/listweatherForecast")
    public Flux<WeatherForecast> getListCitiesWeatherForecast(@RequestParam List<String> cities) {
        return Flux.fromIterable(cities)
                .flatMap(city -> Flux.just(
                        WeatherForecast.builder().city(city).temperature(random.nextDouble()).build(),
                        WeatherForecast.builder().city(city).temperature(random.nextDouble()).build()
                ));
    }
}
