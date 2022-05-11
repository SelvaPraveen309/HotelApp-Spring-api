package com.app.hotel.foodiesgoapi.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.hotel.foodiesgoapi.dao.RegisterRepository;
import com.app.hotel.foodiesgoapi.model.UserRegistration;

@Component
public class UserService {
	@Autowired
	RegisterRepository registerRepository;
	
public String userRegister(UserRegistration register) {
	String name = register.getName();
	String email=register.getEmail();
	String password = register.getPassword();
	String number = register.getNumber();
	String message = null;
	System.out.println(name);
	System.out.println(email);
	System.out.println(password);
	System.out.println(number);
	
	if(name.isBlank()|| name.isEmpty()) {
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
	   try {
		   registerRepository.save(register);
	      
			} catch (Exception e) {
				
					e.printStackTrace();
				}
				
			}
			
			return message; 
}
}

		


