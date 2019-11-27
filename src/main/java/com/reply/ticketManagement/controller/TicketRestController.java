package com.reply.ticketManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reply.ticketManagement.entities.Ticket;
import com.reply.ticketManagement.services.TicketService;

@RestController
public class TicketRestController {
	
	@Autowired
	TicketService service;
	
	@GetMapping("/list")
	public List<Ticket> getTickets(){
		return service.getTickets(); 
	}
	
	@GetMapping("/ticket/{id}")
	public Ticket getTicket(@PathVariable Integer id) {
		return service.getTicket(id).get();
	}
	

}
