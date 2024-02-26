package com.server.server.chat.domain;

import com.server.server.user.domain.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.*;

@Entity
public class ChatRoom {

    @Id @GeneratedValue
    @Column(name = "CHAT_ID")
    private Long id;
    private String title;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    private LocalDateTime createdDate;
    private int peopleLimit;
}
