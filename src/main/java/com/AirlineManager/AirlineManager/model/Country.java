package com.AirlineManager.AirlineManager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "countries")
public class Country {
    @Id
    private String id;
    private String name;
}