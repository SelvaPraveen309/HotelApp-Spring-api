package com.app.Hotel.FoodiesGoAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@ToString
@Data
@Table(name="register")
public class UserRegistration  {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name="name",nullable=false,length= 20)
	private String name;
	@Column(name="email" ,nullable=false,unique= true, length=30)
	private String email;
	@Column (name="password",nullable=false)
	private String password;
	@Column(name="mobile_no",nullable=false)
	private String number;

}
