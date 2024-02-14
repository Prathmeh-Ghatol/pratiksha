package com.example.demo.service;

import com.example.demo.controller.Login;
import com.example.demo.dto.EmpolyeeDto;
import com.example.demo.entity.Employee;

import java.util.Set;

public interface EmpolyeeService {

    public Employee createEmpolyee(EmpolyeeDto empolyeeDto);
    public String Login (Login login);
    public Set<Employee> allEmpolyee();
}
