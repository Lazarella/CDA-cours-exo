package com.example.demo_spring_reactive.controller;

import com.example.demo_spring_reactive.service.NewsService;
import com.example.demo_spring_reactive.service.WeatherService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("dashboard")
public class WeatherAndNewsController {
    private final WeatherService weatherService;
    private final NewsService newsService;

    public WeatherAndNewsController(WeatherService weatherService, NewsService newsService) {
        this.weatherService = weatherService;
        this.newsService = newsService;
    }

    @GetMapping("/feed")
    public Flux<String> getZip() {
        Flux<String> weatherFlux = weatherService.getWeather().delayElements(Duration.ofSeconds(2));
        Flux<String> newsFlux = newsService.getNews();

        return Flux.zip(weatherFlux, newsFlux).map(t ->t.getT1() +t.getT2());
    }
    @GetMapping("/feed/{city}")
    public Flux<String> getZipCity(@PathVariable String city) {
        Flux<String> weatherFlux = weatherService.getWeatherByCity(city).delayElements(Duration.ofSeconds(2));
        Flux<String> newsFlux = newsService.getNewsByCity(city);

        return Flux.zip(weatherFlux, newsFlux).map(t ->t.getT1() +t.getT2());
    }
}