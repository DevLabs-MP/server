package com.server.server.contents.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
@DiscriminatorValue("MOVIE")
public class Movie extends Film {
    private LocalDateTime screeningTime;
    private LocalDateTime releaseDate;
    private int spectatorsCount;
    private long grade;
    private boolean screeningStatus;
}
