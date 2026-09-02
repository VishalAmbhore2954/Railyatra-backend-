package com.vishal.railyatra.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.railyatra.Entity.User;
import com.vishal.railyatra.Repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
//	@Autowired
//	private PasswordEncoder encoder;

	@Override
	public User createUser(User user) {
		
//		user.setPassword(encoder.encode(user.getPassword()));
		return userRepo.save(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	
	
}
