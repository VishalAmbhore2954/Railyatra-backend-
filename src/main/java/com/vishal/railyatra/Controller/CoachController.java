package com.vishal.railyatra.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.railyatra.Entity.Coach;
import com.vishal.railyatra.Services.CoachService;

@RestController
public class CoachController {
	
	@Autowired
	private CoachService coachService;
	
	@PostMapping("/api/coaches")
	public Coach postCoach(@RequestBody Coach coach) {
		return coachService.createCoach(coach);
	}

}
