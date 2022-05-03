package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.Hotel.FoodiesGoAPI.dao.RegisterRepository;
import com.app.Hotel.FoodiesGoAPI.model.UserRegistration;

public class UserService {
	@Autowired
	RegisterRepository registerRepository;
public String userRegister(UserRegistration register) {
	String name = register.getName();
	String email=register.getEmail();
	String password = register.getPassword();
	String number = register.getNumber();
	String message = null;
	if(name.isBlank()|| name.isBlank()) {
		message = "Name cannot be empty";
	}
	
	
	if (!email.contains("@") && !email.contains(".")) {
		message = "Enter correct email";
	}
			if(password.length()<8  || password.length()>16) {
	 message=" enter correct password or password shouls not be minimun 8  and maximum 16 ";
	}
			if (number.length() < 10 || number.length() > 10|| number.isBlank()|| number.isEmpty()) {
				message ="Enter correct number";
			}
			else {
				registerRepository.save(register);
				message ="Successful";
			}
			
			return message; 
}
}

		


