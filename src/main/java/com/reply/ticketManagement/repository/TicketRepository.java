package com.reply.ticketManagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reply.ticketManagement.entities.Ticket;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer>{
	
}
