package com.server.server.appreciate.domain;

import com.server.server.user.domain.User;
import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
public class Collection {

    @Id @GeneratedValue
    @Column(name = "COLLECTION_ID")
    private Long id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "USER_ID")
    private User user;
    private String name;
}
