package com.usermicroservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.usermicroservice.model.User;

public interface UserDao extends CrudRepository<User,Integer>{
	public User findUserByEmailId(String emilId);
}
