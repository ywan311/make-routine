package com.yoowan.domaincore.service.impl;

import com.yoowan.domaincore.service.CheckService;
import com.yoowan.infra.repository.CheckRepository;
import entity.CheckEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CheckServiceImpl implements CheckService {

    private final CheckRepository checkRepository;

    @Override
    public Flux<CheckEntity> getChecks() {
        return checkRepository.findAll();
    }

    @Override
    public Mono<CheckEntity> getCheck(Long id) {
        return checkRepository.findCheckEntityById(id);
    }

//    @Override
//    public Flux<CheckEntity> addCheckByDateRange(AddCheckRequest request) {
//        Duration duration = Duration.between(request.getStartDate(), request.getEndDate());
//
//        List<Instant> dateList = new ArrayList<>();
//        for (int i = 0; i < duration.toDays(); i++) {
//            dateList.add(request.getStartDate());
//        }
//
//        return checkRepository.saveAll(Flux.fromIterable(dateList.parallelStream().map(instant -> CheckEntity.builder().title(request.getTitle()).date(instant).build()).collect(Collectors.toList())));
//    }
}
