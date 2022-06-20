package com.example.demo.entity;

import jdk.jfr.DataAmount;
import lombok.Data;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Customers") @Data
public class Customer {

    @Id
    public String id;

    public String firstName;
    public String lastName;

}