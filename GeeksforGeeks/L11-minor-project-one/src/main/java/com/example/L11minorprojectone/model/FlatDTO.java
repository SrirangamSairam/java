package com.example.L11minorprojectone.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class FlatDTO {

    private int id;

    @NotNull
    @Size(max = 255)
    private String number;

}
