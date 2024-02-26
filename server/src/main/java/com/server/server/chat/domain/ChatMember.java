package com.server.server.chat.domain;

import com.server.server.user.domain.User;
import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
public class ChatMember { //채팅방 사용자

    @Id @GeneratedValue
    private Long no;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "CHAT_ID")
    private ChatRoom chatRoom;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
}
