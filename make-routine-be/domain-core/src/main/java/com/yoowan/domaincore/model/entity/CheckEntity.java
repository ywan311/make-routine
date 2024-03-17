package com.yoowan.domaincore.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.Instant;

@Entity
@Table(name = "check")
public class CheckEntity extends TimeBaseEntity{
    @Id
    private Long id;
    @Column
    private String title;
    @Column
    private Boolean isChecked;
    @Column
    private Instant date;

    @Builder
    public CheckEntity(Long id, String title, Boolean isChecked, Instant date) {
        this.id = id;
        this.title = title;
        this.isChecked = isChecked;
        this.date = date;
    }
}
