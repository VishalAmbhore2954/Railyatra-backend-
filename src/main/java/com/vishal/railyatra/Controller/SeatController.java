package com.vishal.railyatra.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.railyatra.Entity.Seats;
import com.vishal.railyatra.Services.SeatService;

@RestController
public class SeatController {
	
	@Autowired
	private SeatService seatService;
	
	@PostMapping("/api/seats")
	public ResponseEntity<?> createSeat(@RequestBody Seats seat) {
		 Seats s1 = seatService.createSeat(seat);
		 return ResponseEntity.status(HttpStatus.CREATED)
				 .body(Map.of("message" , "Seat created Successfully", "data",s1));
	}

}
