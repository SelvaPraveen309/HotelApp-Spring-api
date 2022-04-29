package com.app.Hotel.FoodiesGoAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.ToString;



@Entity
@ToString
@Table(name = "menu_list")
@Data
public class Menus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "food_name", nullable = false, unique = true, length = 50)
	private String foodName;
	@Column(name = "price", nullable = false)
	private int price;
	@JsonIgnore
	@Column(name = "starting_time")
	private String startingTime;
	@JsonIgnore
	@Column(name = "ending_time")
	private String endingTime;
	@Column(name = "food_type")
	private String foodType;
	@Column(name = "style_of_items")
	private String foodStyle;
}
