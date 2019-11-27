package com.reply.ticketManagement.entities;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "Users")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1658189852522870256L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String nume;
	private String prenume;
	@Column(name = "parola")
	private String parola;

	@OneToMany(mappedBy="id")
	private Set <Ticket> tickets;

	public String getNume() {
		return nume;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}

	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public Set<Ticket> getTicketId() {
		return tickets;
	}

	public void setTickete(Set<Ticket> tickets) {
		this.tickets = tickets;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return nume + " " + prenume;
	}
}
