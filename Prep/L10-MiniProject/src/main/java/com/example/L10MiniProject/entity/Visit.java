package com.example.L10MiniProject.entity;

import com.example.L10MiniProject.dto.VisitStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Entity
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private VisitStatus status = VisitStatus.WAITING;

    @Column
    private LocalDateTime inTime;

    @Column
    private LocalDateTime outTime;

    @Column(nullable = false)
    private String purpose;

    private String imageUrl;

    @Column(nullable = false)
    private int noOfPeople;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="visitor_id",nullable = false)
    private Visitor visitor;

    @OneToOne
    @JoinColumn(name="flat_id",nullable = false)
    private Flat flat;

    @Column(nullable = false, updatable = false)
    @CreatedDate
    private OffsetDateTime dateCreated;

    @LastModifiedDate
    @Column(nullable = false)
    private OffsetDateTime lastUpdated;
}
