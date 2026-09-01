package com.vishal.railyatra.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.railyatra.Entity.Train;
import com.vishal.railyatra.Services.TrainService;

@RestController
public class TrainController {
	
	@Autowired
	private TrainService trainService;

	@PostMapping("/api/trains")
	public Train postTrain(@RequestBody Train train) {
		return trainService.createTrain(train);
	}
	
	@GetMapping("/api/trains")
	public List<Train> getTrains(){
		return trainService.getTrains();
		
	}
}
