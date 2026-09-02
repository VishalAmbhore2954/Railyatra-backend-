package com.vishal.railyatra.Services;

import java.util.List;

import com.vishal.railyatra.Entity.Station;

public interface StationService {
	public Station createStation(Station station);
	public List<Station> getStations();
}
