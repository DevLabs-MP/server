package com.server.server.festival.domain;

import com.server.server.contents.domain.Film;
import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
public class FestivalContents {

    @Id @GeneratedValue
    private Long id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "FESTIVAL_ID")
    private Festival festival;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "FILM_ID")
    private Film film;
    
}
