package com.app.Hotel.FoodiesGoAPI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.Hotel.FoodiesGoAPI.dao.RegisterRepository;
import com.app.Hotel.FoodiesGoAPI.model.UserRegistration;
// Rest APi
@RestController
public class RegisterController {
	// used to call the created object by @repository stored in registerRepository
	// aotwired is used for bean the file tham define as @bean that file is called as configration file.
	// while at scope @scope ("singleton")
	@Autowired
	RegisterRepository registerRepository;
	
	@PostMapping("Registerinsert/save")
	// RequestBody is used to store the data in body and send with url
	public void save (@RequestBody UserRegistration register ) {
		
		
		registerRepository.save(register);
	}
	@GetMapping("User/login")
	public String login(@RequestParam("email")String email ) {
               UserRegistration user= registerRepository.userlogin(email);
				return email;
	}
	

}
