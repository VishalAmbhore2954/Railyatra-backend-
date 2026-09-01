package com.vishal.railyatra.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.railyatra.Entity.Coach;
import com.vishal.railyatra.Entity.Seats;
import com.vishal.railyatra.Repository.CoachRepository;
import com.vishal.railyatra.Repository.SeatsRepo;

@Service
public class SeatServiceImpl implements SeatService{
	
	@Autowired
	private SeatsRepo seatRepo;
	
	@Autowired
	private CoachRepository coachRepo;

	@Override
	public Seats createSeat(Seats seat) {
		// TODO Auto-generated method stub
		
		Coach coach = coachRepo.findById(seat.getCoachid()).orElseThrow(()->new RuntimeException("Coach not found"));
		
		seat.setCoach(coach);
		
		if(seat.getSeatnumber() > Integer.parseInt(coach.getNo_of_seats())) {
			throw new RuntimeException("This coach has "+seat.getSeatnumber()+" seats");
		}else {
			seat.setSeatnumber(seat.getSeatnumber());
		}
		
		return seatRepo.save(seat);
	}

}
