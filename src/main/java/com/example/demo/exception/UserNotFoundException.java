package com.example.demo.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserNotFoundException extends RuntimeException{
    String message;
    String entity;
    public UserNotFoundException(String message, String email){
        super(message + " "  + email);
        this.entity=email;
        this.message=message;
    }
    UserNotFoundException(){

    }


}
