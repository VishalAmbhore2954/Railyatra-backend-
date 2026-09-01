package com.vishal.railyatra.Services;

import org.springframework.stereotype.Service;

import com.vishal.railyatra.Entity.Coach;

@Service
public interface CoachService {
	public Coach createCoach(Coach coach);
}
