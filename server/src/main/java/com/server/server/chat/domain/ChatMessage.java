package com.server.server.chat.domain;

import com.server.server.user.domain.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

import static jakarta.persistence.FetchType.*;

@Entity
public class ChatMessage {

    @Id @GeneratedValue
    private Long no;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "CHAT_ID")
    private ChatRoom chatRoom;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    private String message;
    private LocalDateTime sendTime;
    private Boolean read;
}
