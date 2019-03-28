package com.usermicroservice.service;

import java.util.List;

import com.usermicroservice.model.User;

public interface UserService {
	public User findUser(Integer uId);
	public List<User> findAllUers();
}
