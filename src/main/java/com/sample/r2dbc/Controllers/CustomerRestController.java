package com.sample.r2dbc.Controllers;

import com.sample.r2dbc.Dtos.CustomerReqDto;
import com.sample.r2dbc.Dtos.CustomerResDto;
import com.sample.r2dbc.models.Customer;
import com.sample.r2dbc.repositories.CustomerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerRestController {
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    public CustomerRestController(CustomerRepository customerRepository, ModelMapper modelMapper) {
        this.customerRepository = customerRepository;
        this.modelMapper = modelMapper;
    }

    @PostMapping("add-new")
    public Mono<CustomerResDto> addNewCustomer(@RequestBody CustomerReqDto reqDto) {
        return Mono.just(reqDto)
                .map(customer1 -> modelMapper.map(reqDto, Customer.class))
                .flatMap(customerRepository::save)
                .map(customer -> modelMapper.map(customer, CustomerResDto.class));
    }

    @PostMapping("get-all")
    public Flux<CustomerResDto> getAllCustomers() {
        return customerRepository.findAll()
                .map(customer -> modelMapper.map(customer, CustomerResDto.class));
    }

}
