package com.server.server.board.domain;

import com.server.server.user.domain.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.*;

@Entity
public class BoardMate {
    @Id @GeneratedValue
    @Column(name = "MATE_ID")
    private Long id;
    private String title;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String contents;
    private String category;
}
