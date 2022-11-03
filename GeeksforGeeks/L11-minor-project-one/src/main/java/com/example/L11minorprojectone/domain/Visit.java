package com.example.L11minorprojectone.domain;

import com.example.L11minorprojectone.model.VisitStatus;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Data
public class Visit {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private VisitStatus status;

    private LocalDateTime inTime;

    private LocalDateTime outTime;

    private String purpose;

    private String imageUrl;

    @Column(nullable = false)
    private int noOfPeople;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "visitor_id", nullable = false)
    private Visitor visitor;

    @OneToOne
    @JoinColumn(name = "flat_id", nullable = false)
    private Flat flat;

    @CreatedDate
    @Column(nullable = false)
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;
}
