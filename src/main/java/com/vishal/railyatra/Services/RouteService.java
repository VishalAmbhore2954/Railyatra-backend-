package com.vishal.railyatra.Services;

import java.util.List;

import com.vishal.railyatra.Entity.Route;

public interface RouteService {
	public Route createRoute(Route route);
	public List<Route> getRoutes();
}
