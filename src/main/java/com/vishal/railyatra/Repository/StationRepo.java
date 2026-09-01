package com.vishal.railyatra.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vishal.railyatra.Entity.Station;

public interface StationRepo extends JpaRepository<Station, Integer>{

}
