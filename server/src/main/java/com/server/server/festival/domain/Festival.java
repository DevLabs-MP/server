package com.server.server.festival.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Festival {

    @Id @GeneratedValue
    @Column(name = "FESTIVAL_ID")
    private Long id;
    private String name;
    private LocalDateTime openDate; //개최 시작 날짜
    private LocalDateTime closeDate; //개최 종료 날짜
    private String city; //지역
    private String host; //주최
}
