package com.example.demo.entity;

import jakarta.persistence.*;
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
@Table(name="employee")
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
