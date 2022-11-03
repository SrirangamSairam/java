package com.example.L11minorprojectone.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class VisitorDTO {

    private int id;

    @NotNull
    @Size(max = 255)
    private String name;

    @Size(max = 255)
    private String email;

    @NotNull
    @Size(max = 255)
    private String phone;

    @NotNull
    @Size(max = 255)
    private String idNumber;

    private int address;
}
