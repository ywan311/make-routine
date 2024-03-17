package com.yoowan.externalapi.controller;

import com.yoowan.externalapi.dto.AddCheckRequest;
import com.yoowan.externalapi.service.CheckService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;

@RestController
@RequestMapping("/api/v1/checks")
@RequiredArgsConstructor
public class CheckController {

    private final CheckService checkService;

    @GetMapping("")
    public ResponseEntity<Flux<?>> getCheckList (@RequestParam(name = "searchDate")Instant today) {
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mono<?>> getCheckById (@PathVariable("id")Long id) {
        return ResponseEntity.ok(checkService.getCheck(id));
    }

    @PostMapping("")
    public ResponseEntity<Flux<?>> addCheckDateRange(@RequestBody AddCheckRequest request){
        return ResponseEntity.ok(checkService.addCheckByDateRange(request));
    }
}
