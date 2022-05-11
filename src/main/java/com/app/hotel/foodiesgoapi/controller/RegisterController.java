package com.app.hotel.foodiesgoapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.hotel.foodiesgoapi.dao.RegisterRepository;
import com.app.hotel.foodiesgoapi.model.UserRegistration;
import com.app.hotel.foodiesgoapi.service.LoginValidation;
import com.app.hotel.foodiesgoapi.service.UserService;

// Rest APi
@RestController
public class RegisterController {
	// used to call the created object by @repository stored in registerRepository
	// aotwired is used for bean the file tham define as @bean that file is called as configration file.
	// while at scope @scope ("singleton")
	@Autowired
	RegisterRepository registerRepository;
	
	@Autowired
	UserService userservice;
	
	@Autowired
	LoginValidation loginValidation;
	
	@PostMapping("Registerinsert/save")
	// RequestBody is used to store the data in body and send with url
	public void save (@RequestBody UserRegistration register ) throws Exception {
		
		
	     userservice.userRegister(register);
		 
	}
	
	@PostMapping("User/login")
	public String login(@RequestBody UserRegistration user ) 
	{
		System.out.println(user.getEmail());

               String status=loginValidation.loginValidation(user);
				return status;
	}
	

}
