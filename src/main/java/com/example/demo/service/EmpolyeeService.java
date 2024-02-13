package com.example.demo.service;

import com.example.demo.controller.Login;
import com.example.demo.dto.EmpolyeeDto;
import com.example.demo.entity.Employee;

public interface EmpolyeeService {

    public Employee createEmpolyee(EmpolyeeDto empolyeeDto);
    public String Login (Login login);
}
