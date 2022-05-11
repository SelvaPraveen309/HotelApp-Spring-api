package com.app.hotel.foodiesgoapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.hotel.foodiesgoapi.model.UserRegistration;

@Repository
public interface AdminRepository extends JpaRepository<UserRegistration, Integer> {

	void deleteById(Integer id);

	

}
