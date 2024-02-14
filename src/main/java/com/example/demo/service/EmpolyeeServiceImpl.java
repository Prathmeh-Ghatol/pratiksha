package com.example.demo.service;

import com.example.demo.controller.Login;
import com.example.demo.dao.EmpolyeeDao;
import com.example.demo.dto.EmpolyeeDto;
import com.example.demo.entity.Employee;
import com.example.demo.exception.UserNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class EmpolyeeServiceImpl implements EmpolyeeService{
    @Autowired
    private EmpolyeeDao empolyeeDao;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public Employee createEmpolyee(EmpolyeeDto empolyeeDto) {
        Employee employeeExist=empolyeeDao.findByLoginId(empolyeeDto.getLoginId());
        if(employeeExist!=null){
            throw  new UserNotFoundException("Empolyee Allredy exist with " , empolyeeDto.getLoginId());
        }
        Employee employee=modelMapper.map(empolyeeDto, Employee.class);
        if(employee!=null){
            return empolyeeDao.save(employee);
        }
        return null;
    }

    @Override
    public String Login(Login login) {
        Employee employeeExist = empolyeeDao.findByLoginId(login.getUserName());
        if (employeeExist == null) {
            throw new UserNotFoundException("Empolyee dose not exist or if new empolyee please register", login.getUserName());
        }
        if (employeeExist.getPassword().equals(login.getPassword())) {
            return "Welcome to Our Website," + employeeExist.getName() + " We're delighted to have you here. Take your time to explore and enjoy our content.";
        }

        throw new UserNotFoundException("UserId and Password wrong !!", login.getUserName());

    }

    public Set<Employee> allEmpolyee(){
        List<Employee>all =this.empolyeeDao.findAll();
        Set<Employee> allSet=all.stream().map(employee -> employee).collect(Collectors.toSet());
        return allSet;
    }

}
