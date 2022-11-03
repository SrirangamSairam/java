package com.example.L11minorprojectone.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class AddressDTO {

    private int id;

    @NotNull
    @Size(max = 255)
    private String line1;

    @Size(max = 255)
    private String line2;

    @NotNull
    @Size(max = 255)
    private String city;

    @NotNull
    @Size(max = 255)
    private String country;

    @Size(max = 255)
    private String pincode;

    @NotNull
    @Size(max = 255)
    private String state;
}
