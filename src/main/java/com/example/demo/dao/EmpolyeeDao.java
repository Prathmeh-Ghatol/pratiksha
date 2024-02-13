package com.example.demo.dao;


import com.example.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface EmpolyeeDao extends JpaRepository<Employee, UUID> {
    @Query(value = "SELECT * FROM Employee WHERE login_id = :id", nativeQuery = true)
    Employee findByLoginId(@Param("id") String loginId);
}
