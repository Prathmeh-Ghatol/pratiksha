package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleUserNotFoundException(UserNotFoundException ex) {
        Map<String, String> exceptionMap = new HashMap<>();
        exceptionMap.put("Message", ex.getMessage());
        exceptionMap.put("Entity", ex.getEntity());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionMap);
    }
}
