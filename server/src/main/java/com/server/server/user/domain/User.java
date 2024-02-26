package com.server.server.user.domain;

import com.server.server.appreciate.domain.Collection;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "MEMBER")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private Long id;
    private String name;
    private String password;
    private LocalDateTime joinDate;
    private String profilePhoto;
    private String email;
}
