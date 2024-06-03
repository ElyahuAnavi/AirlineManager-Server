package com.AirlineManager.AirlineManager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

import java.util.Date;

@Data
@Document(collection = "flights")
public class Flight {
    @Id
    private String id;
    private String airlineId;
    private String originCountryId;
    private String destinationCountryId;
    private Date departureTime;
    private Date landingTime;
    private int remainingTickets;
}