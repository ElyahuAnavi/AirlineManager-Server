package com.AirlineManager.AirlineManager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "tickets")
public class Ticket {
    @Id
    private String id;
    private String flightId;
    private String customerId;
}