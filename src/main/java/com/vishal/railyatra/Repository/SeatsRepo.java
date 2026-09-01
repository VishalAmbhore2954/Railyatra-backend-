package com.vishal.railyatra.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.railyatra.Entity.Seats;

public interface SeatsRepo extends JpaRepository<Seats,Integer>{

}
