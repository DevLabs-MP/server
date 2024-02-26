package com.server.server.contents.domain;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
public class Person {
    @Id @GeneratedValue
    private Long id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "FILM_ID")
    private Film film;
    private String name;
    private String profilePhoto;
    private String type;
}
