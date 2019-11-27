package com.reply.ticketManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reply.ticketManagement.entities.Ticket;
import com.reply.ticketManagement.repository.TicketRepository;

@Service
public class TicketService {
	
	@Autowired
	TicketRepository repository;
	
	public List<Ticket> getTickets(){
		return (List<Ticket>) repository.findAll();
	}
	
	public Optional<Ticket> getTicket(Integer id) {
		return repository.findById(id);
	}

}
