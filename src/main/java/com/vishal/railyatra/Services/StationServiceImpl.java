package com.vishal.railyatra.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.railyatra.Entity.Station;
import com.vishal.railyatra.Repository.StationRepo;

@Service
public class StationServiceImpl implements StationService{

	@Autowired
	private StationRepo stationRepo;
	@Override
	public Station createStation(Station station) {
		return stationRepo.save(station);	
	}

}
