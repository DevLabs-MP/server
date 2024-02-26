package com.server.server.contents.domain;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
public class OTT {
    @Id @GeneratedValue
    @Column(name = "OTT_ID")
    private Long id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "FILM_ID")
    private Film film;
}
