package com.example.L11minorprojectone.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class UserDTO {

    private int id;

    @NotNull
    @Size(max = 255)
    private String name;

    @NotNull
    @Size(max = 255)
    private String email;

    @Size(max = 255)
    private String phone;

    @NotNull
    @Size(max = 255)
    private String role;

    @NotNull
    private UserStatus status;

    private int flat;

    private int address;
}
