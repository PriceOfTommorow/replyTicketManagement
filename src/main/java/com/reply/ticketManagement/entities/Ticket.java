package com.reply.ticketManagement.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "Tickets")
public class Ticket implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2244401616781460760L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String titlu;
	private String descriere;
	@Enumerated(EnumType.STRING)
	private Status status;
	@Column(name = "startDate")
	private Date startDate;
	@Column(name = "dueDate")
	private Date dueDate;
	private boolean urgent;
	@ManyToOne
	@JoinColumn(name = "userid")
	private User userid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitlu() {
		return titlu;
	}

	public void setTitlu(String titlu) {
		this.titlu = titlu;
	}

	public String getDescriere() {
		return descriere;
	}

	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public boolean isUrgent() {
		return urgent;
	}

	public void setUrgent(boolean urgent) {
		this.urgent = urgent;
	}

	@JsonIgnore
	public User getUser() {
		return userid;
	}

	public void setUser(User userid) {
		this.userid = userid;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String toString() {
		return userid.getNume() + " " + userid.getPrenume() + " " + getTitlu();
	}

}
