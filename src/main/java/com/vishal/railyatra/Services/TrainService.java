package com.vishal.railyatra.Services;

import java.util.List;

import com.vishal.railyatra.Entity.Train;

public interface TrainService {
	public Train createTrain(Train train);
	public List<Train> getTrains();
}
