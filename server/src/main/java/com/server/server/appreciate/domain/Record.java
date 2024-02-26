package com.server.server.appreciate.domain;

import com.server.server.contents.domain.Film;
import com.server.server.user.domain.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.*;

@Entity
public class Record {

    @Id @GeneratedValue
    @Column(name = "RECORD_ID")
    private Long id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "FILM_ID")
    private Film film;
    @Enumerated(EnumType.STRING)
    private Category category;
    private LocalDateTime viewStartDate; //감상 시작날짜
    private LocalDateTime viewEndDate; //감상 종료날짜
    private int reviewPoint; //별점
    private String review; //리뷰내용
}
