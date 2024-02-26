package com.server.server.contents.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("DRAMA")
public class Drama extends Film{
    private String director;
}
