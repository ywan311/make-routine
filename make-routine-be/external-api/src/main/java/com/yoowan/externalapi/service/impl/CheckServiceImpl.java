package com.yoowan.externalapi.service.impl;

import com.yoowan.domaincore.model.entity.CheckEntity;
import com.yoowan.externalapi.service.CheckService;
import com.yoowan.infra.repository.CheckRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class CheckServiceImpl implements CheckService {

    private final CheckRepository checkRepository;

    @Override
    public Flux<CheckEntity> getChecks() {
        return null;
    }

    @Override
    public Mono<CheckEntity> getCheck(Long id) {
        return checkRepository.findCheckEntityById(id);
    }
}
