package com.example.meronambelutrainreservation.controller;

import com.example.meronambelutrainreservation.model.Ticket;
import com.example.meronambelutrainreservation.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TicketController {
    @Autowired
    TicketService ticketServiceLayer;

    @PostMapping("/ticket")
    public Ticket addTicket (@RequestBody Ticket ticket) {
        return ticketServiceLayer.createTicket(ticket);
    }

    @GetMapping("/ticket")
    public List<Ticket> getAllTickets () {

        return ticketServiceLayer.findAllTickets();
    }

    @GetMapping ("/ticket/{routeId}")
    public Ticket getTicketById (@PathVariable Integer routeId){
        return ticketServiceLayer.getTicketByRouteId(routeId);
    }

    @PutMapping ("/ticket")
    public void updateTicket(@RequestBody Ticket ticket) {
        ticketServiceLayer.updateTicket(ticket);
    }

    @DeleteMapping ("/ticket/{ticketId}")
    public void deleteTicket(@PathVariable Integer routeId) {
        ticketServiceLayer.deleteTicketByRouteId(routeId);
    }

}
