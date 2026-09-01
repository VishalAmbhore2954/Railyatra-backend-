package com.vishal.railyatra.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.railyatra.Entity.Train;
import com.vishal.railyatra.Repository.TrainRepo;



@Service
public class TrainServiceImpl implements TrainService{
	
	@Autowired
	private TrainRepo trainRepo;

	@Override
	public Train createTrain(Train train) {
		// TODO Auto-generated method stub
		return trainRepo.save(train);
	}

	@Override
	public List<Train> getTrains() {
		// TODO Auto-generated method stub
		return trainRepo.findAll();
	}

}
