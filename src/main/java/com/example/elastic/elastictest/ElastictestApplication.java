package com.example.elastic.elastictest;

import com.example.elastic.elastictest.models.Customer;
import com.example.elastic.elastictest.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
public class ElastictestApplication {

    @Autowired
    private CustomerRepo customerRepo;

    @PostMapping("/saveCustomer")
    public int saveCustomer(@RequestBody List<Customer> customers) {
        customerRepo.saveAll(customers);
        return customers.size();
    }

    @GetMapping("/findAll")
    public Iterable<Customer> findAllCustomers() {
        return customerRepo.findAll();
    }

    @GetMapping("/findByName/{firstName}")
    public List<Customer> findByFirstName(@PathVariable String firstName) {
        return customerRepo.findByFirstName(firstName);
    }

    public static void main(String[] args) {
        SpringApplication.run(ElastictestApplication.class, args);
    }

}

