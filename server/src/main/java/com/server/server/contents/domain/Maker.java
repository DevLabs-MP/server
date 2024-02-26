package com.server.server.contents.domain;

import com.server.server.appreciate.domain.Category;
import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
public class Maker {
    @Id @GeneratedValue
    @Column(name = "MAKER_ID")
    private Long id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "FILM_ID")
    private Film film;
    @Enumerated(EnumType.STRING)
    private Category category;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    private String profilePhoto;
}
