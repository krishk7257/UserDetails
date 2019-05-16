package com.spring.mongo.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.mongo.api.model.UserData;
import com.spring.mongo.api.repository.UserDataRepository;

@RestController
public class UserDataController {

	@Autowired
	private UserDataRepository repository;
	
	
	@GetMapping("/")
	public String homePage() {
		return "welcome to Spring Boot API";
	}
	
//	@ApiOperation(value = "Add the JSON data to the database")
	@PostMapping("/addUserDetails")
	public String saveUserData(@RequestBody UserData userData) {
		repository.save(userData);
		return "Added user data successfully";
	}
	
	
	@GetMapping("/getData")
	public List<UserData>getUserData(){
		return repository.findAll();
	}
}
