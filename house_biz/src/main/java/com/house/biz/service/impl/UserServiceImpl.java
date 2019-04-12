package com.house.biz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.biz.mapper.UserMapper;
import com.house.biz.service.UserService;
import com.house.common.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	public List<User> userList(){
		return userMapper.selectUsers();
	}
}
