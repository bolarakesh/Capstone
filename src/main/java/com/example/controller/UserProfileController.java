package com.example.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.UserProfile;
import com.example.repository.UserProfileRepository;

@RestController
@RequestMapping("/user")
public class UserProfileController {
//	@Autowired
//	private UserProfileRepository repo ;
//	@GetMapping("/users")
//	public List<UserProfile> getAllUserProfiles(){
//		return repo.findAll();
//	}
		 
	 }