package com.AirlineManager.AirlineManager.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNo;
    private String creditCardNo;
    private String userId;
}