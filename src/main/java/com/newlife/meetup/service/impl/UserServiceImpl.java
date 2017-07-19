package com.newlife.meetup.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newlife.meetup.domain.User;
import com.newlife.meetup.repository.UserRepository;
import com.newlife.meetup.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public String checkUser(String phoneNumber) {
		String result = "N";
		try {
			 List<User> users = this.userRepository.findUserByPhoneNumber(phoneNumber);
			 if(users.size()>0) {
				 result = "Y";
			 }
		}catch (Exception e) {
			e.getCause();
		}
		return result;
	}

	//addUser 
	@Override
	public String addUser(User user) {
		String usable = checkUser(user.getPhoneNumber());
		try {
			if(!usable.equals("Y")) {
				this.userRepository.save(user);
			}
		}catch (Exception e) {
			return "faild";
		}
		
		return "success";
	}
	
	
}
