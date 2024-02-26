package com.server.server.contents.domain;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Contents {

    private String title;
    @Enumerated(EnumType.STRING)
    private Genre genre;
    private String productionCrew;
    private String film_cast;
    private String poster;
    private String preview;
    private String stillCut;
    private String synopsis;
    private String distributor;
    private String country;
}
