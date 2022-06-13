package com.sample.r2dbc.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table("customer")
public class Customer {

    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String birthDate;

}
