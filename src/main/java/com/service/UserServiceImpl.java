package com.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.MyUser;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	public UserDao userDao;
	
	public List<MyUser> getUsers() {
		return userDao.getUsers();
	}

}
