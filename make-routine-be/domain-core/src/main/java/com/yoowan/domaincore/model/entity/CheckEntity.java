package com.yoowan.domaincore.model.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "check")
public class CheckEntity extends TimeBaseEntity{
    @Id
    private Long id;
    @Column
    private String title;
    @Column
    private Boolean isChecked;

}
