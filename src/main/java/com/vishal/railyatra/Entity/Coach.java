package com.vishal.railyatra.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

@Entity
public class Coach {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int coachid;
	
	@Column
	private String coachnumber;
	
	@ManyToOne
	@JoinColumn(name = "train_id")
	private Train train;
	
	@Transient
	private int train_id;
	
	@Column
	private String no_of_seats;

	public int getCoachid() {
		return coachid;
	}

	public void setCoachid(int coachid) {
		this.coachid = coachid;
	}

	public String getCoachnumber() {
		return coachnumber;
	}

	public void setCoachnumber(String coachnumber) {
		this.coachnumber = coachnumber;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public String getNo_of_seats() {
		return no_of_seats;
	}

	public void setNo_of_seats(String no_of_seats) {
		this.no_of_seats = no_of_seats;
	}

	public int getTrain_id() {
		return train_id;
	}

	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}

			
}
