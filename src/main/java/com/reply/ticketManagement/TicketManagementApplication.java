package com.reply.ticketManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.reply.ticketManagement")
public class TicketManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketManagementApplication.class, args);
	}

}
