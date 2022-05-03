package com.app.Hotel.FoodiesGoAPI.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Hotel.FoodiesGoAPI.model.UserRegistration;

@Repository
public interface AdminRepository extends JpaRepository<UserRegistration, Integer> {

	void deleteById(Integer id);

	

}
