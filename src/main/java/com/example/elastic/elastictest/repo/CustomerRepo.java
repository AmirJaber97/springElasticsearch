package com.example.elastic.elastictest.repo;

import com.example.elastic.elastictest.models.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by Amir Jaber on Янв., 2019
 */
public interface CustomerRepo extends ElasticsearchRepository<Customer, String> {

    List<Customer> findByFirstName(String firstName);
}
