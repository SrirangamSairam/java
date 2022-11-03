package com.example.L11minorprojectone.domain;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.OffsetDateTime;
import java.util.Set;

@Entity
@Data
public class Flat {
    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String number;

    @OneToMany(mappedBy = "flat")
    private Set<User> flatUsers;

    @OneToOne(mappedBy = "flat", fetch = FetchType.LAZY)
    private Visit visit;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;
}
