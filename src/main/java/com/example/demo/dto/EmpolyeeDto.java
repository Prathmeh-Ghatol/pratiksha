package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EmpolyeeDto {

    private String name;
    private Date dateOfBirth;
    private String gender;
    private String address;
    private String city;
    private String state;

    private String loginId;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

}
