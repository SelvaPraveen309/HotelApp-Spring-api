package com.app.Hotel.FoodiesGoAPI.dao;



import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.Hotel.FoodiesGoAPI.model.Menus;
// bean it cerate an pre object for user
@Repository
public interface MenuListRepository extends JpaRepository<Menus, Integer>{
//	Menus save(Menus menulist);
//	@Query("select from com.app.Hotel.FoodiesGoAPI.model.Menus m where m.id=:id")
//	Menus findById(@)
	
	
	Optional<Menus> findById(Integer id);
	
	@Query("select u from com.app.Hotel.FoodiesGoAPI.model.Menus u where u.price=:price")
	List<Menus>findByPrice(@Param("price")Integer price);

	@Query("select f from com.app.Hotel.FoodiesGoAPI.model.Menus f where f.foodName=:food_name")
	List<Menus>findByName(@Param("food_name")String foodName);
}
