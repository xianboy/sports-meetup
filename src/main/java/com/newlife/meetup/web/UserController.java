package com.newlife.meetup.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newlife.meetup.domain.User;
import com.newlife.meetup.service.IUserService;

@RestController
@RequestMapping({"/sports-meetup/user", "/sports-meetup/user/v1.0"})
public class UserController {
	
	@Autowired
	private IUserService userService;

	@GetMapping("/checkUser/{phoneNumber}")
	public String checkUser(@PathVariable String phoneNumber){
		
		return this.userService.checkUser(phoneNumber);
	}
	
	//add User
	@PostMapping("/addUser")
	public String addUser(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
}
