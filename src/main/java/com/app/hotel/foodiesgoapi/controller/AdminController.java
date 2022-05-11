package com.app.hotel.foodiesgoapi.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.hotel.foodiesgoapi.dao.AdminRepository;

@RestController
public class AdminController {
@Autowired
 AdminRepository adminRepository;
@PostMapping("DeleteUser/{id}")
public void deleteUser(@PathVariable("id")Integer id) {
	adminRepository.deleteById(id);
	
}
}
