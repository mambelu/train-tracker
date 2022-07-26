package com.example.meronambelutrainreservation.service;

import com.example.meronambelutrainreservation.model.Station;
import com.example.meronambelutrainreservation.model.Ticket;
import com.example.meronambelutrainreservation.repository.StationRepository;
import com.example.meronambelutrainreservation.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Autowired
    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    public Ticket getTicketByRouteId(Integer routeId) {
        Optional<Ticket> ticket = ticketRepository.findById(routeId);
        return ticket.isPresent() ? ticket.get() : null;
    }

    public List<Ticket> findAllTickets() {
        return ticketRepository.findAll();
    }
    public void updateTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void deleteTicketByRouteId(Integer routeId) {
        ticketRepository.deleteById(routeId);
    }
}
