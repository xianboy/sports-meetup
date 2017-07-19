package com.newlife.meetup.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long userId;
	
	private String phoneNumber;
	
	private String verificationCode;
	
	private String password;
	
	

	public User(Long userId, String phoneNumber, String verificationCode, String password) {
		super();
		this.userId = userId;
		this.phoneNumber = phoneNumber;
		this.verificationCode = verificationCode;
		this.password = password;
	}

	
	public User() {
		super();
	}
	


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getVerificationCode() {
		return verificationCode;
	}

	public void setVerificationCode(String verificationCode) {
		this.verificationCode = verificationCode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", phoneNumber=" + phoneNumber + ", verificationCode=" + verificationCode
				+ ", password=" + password + "]";
	}
	
	
		
}
