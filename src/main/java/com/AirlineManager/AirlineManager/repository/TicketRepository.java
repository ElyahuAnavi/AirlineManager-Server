package com.AirlineManager.AirlineManager.repository;

import com.AirlineManager.AirlineManager.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String> {}
