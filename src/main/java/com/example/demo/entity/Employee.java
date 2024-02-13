package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID empId;
    private String name;
    private Date dateOfBirth;
    private String gender;
    private String address;
    private String city;
    private String state;
    private String loginId;
    private String password;
}
