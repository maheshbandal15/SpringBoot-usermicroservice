package com.usermicroservice.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usermicroservice.model.User;
import com.usermicroservice.service.UserService;

@RestController
@RequestMapping("/getuser")
public class ApplicationController {
	
	@Autowired
	private UserService userService;
	
	@GET
	@RequestMapping("/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public User getLibrary(@PathVariable("userId") String userId) {
		return userService.findUser(Integer.parseInt(userId));
	}

}
