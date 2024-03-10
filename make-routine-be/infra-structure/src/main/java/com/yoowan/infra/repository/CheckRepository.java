package com.yoowan.infra.repository;

import com.yoowan.domaincore.model.entity.CheckEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface CheckRepository extends ReactiveCrudRepository<CheckEntity,Long> {

    Mono<CheckEntity> findCheckEntityById(Long id);
}
