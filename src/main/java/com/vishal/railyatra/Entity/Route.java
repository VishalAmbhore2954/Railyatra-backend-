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

@Entity
@Table(name="routes")
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "train_id")
	private Train train;
	
	@ManyToOne
	@JoinColumn(name = "station_id")
	private Station station;
	
	@Column
	private int station_order;
	
	@Column
	private boolean has_stop;
	
	@Column
	private String arrival;
	
	@Column
	private String departure;
	
	@Transient
	private String train_id;
	
	public String getTrain_id() {
		return train_id;
	}
	
	@Transient
	private String station_id;

	public void setTrain_id(String train_id) {
		this.train_id = train_id;
	}

	public String getStation_id() {
		return station_id;
	}

	public void setStation_id(String station_id) {
		this.station_id = station_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public Station getStation() {
		return station;
	}

	public void setStation(Station station) {
		this.station = station;
	}

	public int getStation_order() {
		return station_order;
	}

	public void setStation_order(int station_order) {
		this.station_order = station_order;
	}

	public boolean isHas_stop() {
		return has_stop;
	}

	public void setHas_stop(boolean has_stop) {
		this.has_stop = has_stop;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}
}
