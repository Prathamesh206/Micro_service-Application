package com.sts.contactService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.contactService.entity.Contacts;
import com.sts.contactService.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	@Autowired
	ContactService contactService;

	@RequestMapping("/user/{uid}")
	public List<Contacts> getContacts(@PathVariable("uid") int id){
	return	this.contactService.getContacts(id);
		
	}
}
