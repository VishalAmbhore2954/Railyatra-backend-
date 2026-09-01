package com.vishal.railyatra.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.railyatra.Entity.Route;
import com.vishal.railyatra.Entity.Train;
import com.vishal.railyatra.Entity.Station;
import com.vishal.railyatra.Repository.RouteRepo;
import com.vishal.railyatra.Repository.StationRepo;
import com.vishal.railyatra.Repository.TrainRepo;

@Service
public class RouteServiceImpl implements RouteService{
	
	@Autowired
	private RouteRepo routeRepo;
	
	@Autowired
	private TrainRepo trainRepo;
	
	@Autowired
	private StationRepo stationRepo;

	@Override
	public Route createRoute(Route route) {
		Train t = trainRepo.findById(Integer.parseInt(route.getTrain_id())).orElseThrow(()->new RuntimeException("Train not found"));
		
		Station s = stationRepo.findById(Integer.parseInt(route.getStation_id())).orElseThrow(()->new RuntimeException("Station not found"));
		
		route.setTrain(t);
		route.setStation(s);
		
		return routeRepo.save(route);
	}

}
