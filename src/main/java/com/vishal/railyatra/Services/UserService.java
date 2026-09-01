package com.vishal.railyatra.Services;

import java.util.List;

import com.vishal.railyatra.Entity.User;

public interface UserService {
	public User createUser(User user);
	public List<User> getUsers();
}
