package com.vishal.railyatra.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishal.railyatra.Entity.User;

@Repository
public interface UserRepo extends JpaRepository<User,Integer>{

}
