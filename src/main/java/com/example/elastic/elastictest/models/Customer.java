package com.example.elastic.elastictest.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by Amir Jaber on Янв., 2019
 */

@Document(indexName = "testindex", type = "customer", shards = 2)
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int age;
}
