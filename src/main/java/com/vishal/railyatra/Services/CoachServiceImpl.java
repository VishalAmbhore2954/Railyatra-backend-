package com.vishal.railyatra.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.railyatra.Entity.Coach;
import com.vishal.railyatra.Entity.Train;
import com.vishal.railyatra.Repository.CoachRepository;
import com.vishal.railyatra.Repository.TrainRepo;

@Service
public class CoachServiceImpl implements CoachService{
	
	@Autowired
	private CoachRepository coachRepo;
	
	@Autowired
	private TrainRepo trainRepo;

	@Override
	public Coach createCoach(Coach coach) {
		// TODO Auto-generated method stub
		Train train = trainRepo.findById(coach.getTrain_id()).orElseThrow(()-> new RuntimeException("Train not found"));
		
		coach.setTrain(train);
		
		return coachRepo.save(coach);
	}
	

}
