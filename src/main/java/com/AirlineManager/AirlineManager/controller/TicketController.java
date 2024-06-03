package com.AirlineManager.AirlineManager.controller;

import com.AirlineManager.AirlineManager.model.Ticket;
import com.AirlineManager.AirlineManager.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    @Autowired
    private TicketService ticketService;

    @GetMapping
    public List<Ticket> getAllTickets() {
        return ticketService.getAllTickets();
    }

    @GetMapping("/{id}")
    public Ticket getTicketById(@PathVariable String id) {
        return ticketService.getTicketById(id);
    }

    @PostMapping
    public Ticket createTicket(@RequestBody Ticket ticket) {
        return ticketService.saveTicket(ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteTicket(@PathVariable String id) {
        ticketService.deleteTicket(id);
    }
}
