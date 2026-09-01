package com.vishal.railyatra.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.railyatra.Entity.Train;

public interface TrainRepo extends JpaRepository<Train,Integer>{

}
