package com.app.hotel.foodiesgoapi.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.hotel.foodiesgoapi.model.UserRegistration;

@Repository
public interface RegisterRepository extends JpaRepository<UserRegistration,Integer> {
	
	@Transactional
	@Query("select l from com.app.hotel.foodiesgoapi.model.UserRegistration l where l.email=:email")
     UserRegistration login(@Param("email")String email);
}
