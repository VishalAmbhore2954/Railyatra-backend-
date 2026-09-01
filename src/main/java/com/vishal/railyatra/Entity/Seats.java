package com.vishal.railyatra.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "seats",uniqueConstraints = {@UniqueConstraint(columnNames={"coachid","seatnumber"})})
public class Seats {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "seatnumber")
	private int seatnumber;
	
	@Column(name = "seattype")
	private String seattype;
	
	@Column(name = "seatstatus")
	private String seatstatus;
	
	@ManyToOne
	@JoinColumn(name = "coachid",nullable = false)
	private Coach coach;
	
	@Transient
	private int coachid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public String getSeattype() {
		return seattype;
	}

	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}

	public String getSeatstatus() {
		return seatstatus;
	}

	public void setSeatstatus(String seatstatus) {
		this.seatstatus = seatstatus;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach = coach;
	}

	public int getCoachid() {
		return coachid;
	}

	public void setCoachid(int coachid) {
		this.coachid = coachid;
	}
}
