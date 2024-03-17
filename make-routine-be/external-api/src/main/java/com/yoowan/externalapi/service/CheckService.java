package com.yoowan.externalapi.service;

import com.yoowan.domaincore.model.entity.CheckEntity;
import com.yoowan.externalapi.dto.AddCheckRequest;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface CheckService {

    Flux<CheckEntity> getChecks();

    Mono<CheckEntity> getCheck(Long id);

    Flux<CheckEntity> addCheckByDateRange(AddCheckRequest request);
}
