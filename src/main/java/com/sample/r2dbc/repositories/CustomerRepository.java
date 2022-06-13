package com.sample.r2dbc.repositories;

import com.sample.r2dbc.models.Customer;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

public interface CustomerRepository extends R2dbcRepository<Customer, Long> {

}
