package com.example.L10springjpademo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false,length = 35)
    private String name;
    @Column(nullable = false)
    private double salary;
    @OneToOne(cascade = CascadeType.ALL)
    private Address address;
    @ManyToOne
    @JsonIgnoreProperties("employees")
    private Branch branch;
}
