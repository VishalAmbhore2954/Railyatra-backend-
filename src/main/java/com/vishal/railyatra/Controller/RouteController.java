package com.vishal.railyatra.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.railyatra.Entity.Route;
import com.vishal.railyatra.Services.RouteService;

@RestController
public class RouteController {

	@Autowired
	private RouteService routeService;
	
	@PostMapping("/api/routes")
	public ResponseEntity<?> createRoute(@RequestBody Route route) {
		Route r =  routeService.createRoute(route);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(Map.of("message","Route Station added","data",r));
		
	}
}
