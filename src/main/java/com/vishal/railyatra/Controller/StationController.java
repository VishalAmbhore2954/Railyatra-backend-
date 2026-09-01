package com.vishal.railyatra.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.railyatra.Entity.Station;
import com.vishal.railyatra.Services.StationService;

@RestController
public class StationController {
	
	@Autowired
	private StationService stationService;
	
	@PostMapping("/api/stations")
	public ResponseEntity<?> createStation(@RequestBody Station station) {
		Station s = stationService.createStation(station);
		
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(Map.of("message","Station created successfully","data",s));
	}
}
