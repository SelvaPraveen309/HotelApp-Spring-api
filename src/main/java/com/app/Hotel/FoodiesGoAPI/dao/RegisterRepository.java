package com.app.Hotel.FoodiesGoAPI.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.Hotel.FoodiesGoAPI.model.UserRegistration;
@Repository
public interface RegisterRepository extends JpaRepository<UserRegistration,Integer> {
	
	@Transactional
	@Modifying
	@Query("select l.email, l.password from com.app.Hotel.FoodiesGoAPI.model.UserRegistration l where l.email=:email")
    UserRegistration userlogin(@Param("email")String email);
}
