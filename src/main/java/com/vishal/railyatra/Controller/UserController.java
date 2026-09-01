package com.vishal.railyatra.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vishal.railyatra.Entity.User;
import com.vishal.railyatra.Services.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;

	@PostMapping("/users")
	public User PostUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getUsers(){
		return userService.getUsers();
	}
}
