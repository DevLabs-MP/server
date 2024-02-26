package com.server.server.contents.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.*;

@Entity
public class MovieSchedule {
    @Id @GeneratedValue
    @Column(name = "SCHEDULE_ID")
    private Long id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "FILM_ID")
    private Film film;
    private String movieTitle;
    private String theater;
    private LocalDateTime viewStartDate; //상영 시작 날짜
    private LocalDateTime viewEndDate; //상영 종료 날짜
}
