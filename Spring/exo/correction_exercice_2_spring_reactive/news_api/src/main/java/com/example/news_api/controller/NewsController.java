package com.example.news_api.controller;


import com.example.news_api.entity.News;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("news")
public class NewsController {

    @GetMapping("/{city}")
    public Mono<List<News>> get(@PathVariable("city") String city) {
        return Mono.just(Arrays.asList(News.builder().city(city).content(city +" News 1").build(), News.builder().city(city).content(city +" News 2").build()));
    }
    @GetMapping("/listcities")
    public Flux<News> getListCitiesNews(@RequestParam List<String> cities) {
        return Flux.fromIterable(cities)
                .flatMap(city -> Flux.just(
                        News.builder().city(city).content(city + " News 1").build(),
                        News.builder().city(city).content(city + " News 2").build()
                ));
    }
}
