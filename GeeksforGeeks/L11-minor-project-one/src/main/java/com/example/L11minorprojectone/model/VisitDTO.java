package com.example.L11minorprojectone.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Data
public class VisitDTO {

    private int id;

    @NotNull
    private VisitStatus status = VisitStatus.WAITING;

    private LocalDateTime inTime;

    private LocalDateTime outTime;

    @Size(max = 255)
    private String purpose;

    @Size(max = 255)
    private String imageUrl;

    @NotNull
    private Integer noOfPeople;

    @NotNull
    private int visitor;

    @NotNull
    private int flat;
}
