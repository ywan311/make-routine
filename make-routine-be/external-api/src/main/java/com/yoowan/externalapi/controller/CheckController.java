package com.yoowan.externalapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;

@RestController
@RequestMapping("/checks")
public class CheckController {

    @GetMapping("")
    public Flux<ResponseEntity<?>> getCheckList (@RequestParam(name = "searchDate")Instant today) {
        return null;
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<?>> getCheckById (@PathVariable("id")Long id) {
        return null;
    }
}
