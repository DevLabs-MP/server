package com.server.server.appreciate.domain;

import jakarta.persistence.*;

import static jakarta.persistence.FetchType.*;

@Entity
public class CollectionContents {

    @Id @GeneratedValue
    @Column(name = "CONTENTS_ID")
    private Long id;
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "COLLECTION_ID")
    private Collection collection;
}
