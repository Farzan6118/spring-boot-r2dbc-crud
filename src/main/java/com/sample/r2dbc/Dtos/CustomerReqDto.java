package com.sample.r2dbc.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerReqDto {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String birthDate;

}
