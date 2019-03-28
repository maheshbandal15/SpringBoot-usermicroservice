package com.usermicroservice.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermicroservice.model.User;
import com.usermicroservice.repository.UserDao;

@Service
@Transactional
public class UserServiceImpl implements  UserService{
	
//	@Autowired
	User user;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unused")
	@Autowired
	private final UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public User findUser(Integer uId) {
		// TODO Auto-generated method stub
		return userDao.findOne(uId);
	}

	@Override
		public List<User> findAllUers() {
		List<User>  users= (List<User>) userDao.findAll();
		return users;
		}

}
