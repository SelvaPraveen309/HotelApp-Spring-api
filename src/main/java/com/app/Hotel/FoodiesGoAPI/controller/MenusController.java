package com.app.Hotel.FoodiesGoAPI.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.Hotel.FoodiesGoAPI.dao.MenuListRepository;
import com.app.Hotel.FoodiesGoAPI.model.Menus;

@RestController
public class MenusController {
	@Autowired

	MenuListRepository menuRepository;

	@PostMapping("MenuInsert/save")

	public void save(@RequestBody Menus menulist) {

		menuRepository.save(menulist);
	} 

	@GetMapping("MenuList/list")

	public List<Menus> findAll() {

		List<Menus> list = menuRepository.findAll();

		return list;

	}

	@DeleteMapping("MenuDelete/{id}")

	public void delete(@PathVariable("id") Integer id) {

		menuRepository.deleteById(id);
		

	}

	@PutMapping("Menuupdate/{id}")

	public void update(@PathVariable("id") Integer id, @RequestBody Menus menulist) {

		menulist.setId(id);

		menuRepository.save(menulist);
	}

	@GetMapping("MenuById/{id}")

	public Optional<Menus> findById(@PathVariable("id") Integer id) {

		Optional<Menus> m = menuRepository.findById(id);
		return m;
	}

	@GetMapping("MenuFindPrice/{price}") // find by less than price
	public List<Menus> findByPrice(@PathVariable("price") Integer price) {
		List<Menus> menuPrice = menuRepository.findByPrice(price);
		return menuPrice;
	}

	@GetMapping("FindMenuByName/{food_name}")
	public List<Menus> findByName(@PathVariable("food_name") String foodName) {
		List<Menus> menuName = menuRepository.findByName(foodName);
		System.out.println("foodName");
		return menuName;
	}
	@GetMapping("DishesByLetter/search")
	public List<Menus>dishesByLetter(@RequestParam("food_name")String foodName){
		List<Menus>menus=menuRepository.findAll();
		List<Menus>filteredMenus=menus.stream().filter(food ->food.getFoodName().toLowerCase().contains(foodName.toLowerCase())).collect(Collectors.toList());
		System.out.println(filteredMenus);
		return  filteredMenus;
		
	}

}
