package com.yoowan.domaincore.service;


import entity.CheckEntity;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface CheckService {

    Flux<CheckEntity> getChecks();

    Mono<CheckEntity> getCheck(Long id);

//    Flux<CheckEntity> addCheckByDateRange(AddCheckRequest request);
}
