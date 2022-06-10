package com.sts.userservice.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sts.userservice.entity.Contacts;
import com.sts.userservice.entity.User;
import com.sts.userservice.userserviceImpl.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;
	@Autowired
	RestTemplate restTemplate;
	
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") int id) {
		
	User user =this.userService.getUser(id);
	 List contact=this.restTemplate.getForObject("http://localhost:9002/contacts/user/"+user.getId(),List.class);
		user.setContacts(contact);
		return user;
				
	}

	
}
