package com.server.server.contents.domain;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
public abstract class Film extends Contents { //작품

    @Id @GeneratedValue
    @Column(name = "FILM_ID")
    private Long id;
}
