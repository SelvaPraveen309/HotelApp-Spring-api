package com.app.hotel.foodiesgoapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.hotel.foodiesgoapi.dao.RegisterRepository;
import com.app.hotel.foodiesgoapi.model.UserRegistration;

@Component
public class LoginValidation {
	
	@Autowired
	RegisterRepository registerRepository;
	
	public String loginValidation( UserRegistration users) {
		String message = null;
		UserRegistration user= registerRepository.login( users.getEmail()) ;
		if( user == null){
			 message ="No records found ";
		}
			 
		else if(users.getPassword().equals(user.getPassword())) {
			 message = "Login successfull ";
		}
		else{
			 message ="Invalid Credentials";
		}
	
		return message ;

}
		
}