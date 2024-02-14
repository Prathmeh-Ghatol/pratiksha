package com.example.demo.controller;

import com.example.demo.dto.EmpolyeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmpolyeeServiceImpl;
import jdk.jfr.Registered;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
public class EmpolyeeController {

    @Autowired
    EmpolyeeServiceImpl empolyeeService;
    @PostMapping(value = "/emp/registration")
    public ResponseEntity<String>createUser(@RequestBody EmpolyeeDto empolyeeDto){
      Employee employee=  empolyeeService.createEmpolyee(empolyeeDto);
        if(employee==null){
            throw  new RuntimeException("Internal Issue");
        }
        return  ResponseEntity.ok("Empolyee register successfully ");
    }
    @PostMapping(value = "/emp/login")
    public ResponseEntity<String>login(@RequestBody Login login){
        String s=  empolyeeService.Login(login);
        return  ResponseEntity.ok(s);
    }
    @GetMapping(value = "/emp/get/all")
    public ResponseEntity<Set<Employee>>getAllEmp(){
        Set<Employee>all=this.empolyeeService.allEmpolyee();
        return  ResponseEntity.status(HttpStatus.OK).body(all);
    }


}
