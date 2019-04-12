package com.house.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.house.biz.service.UserService;
import com.house.common.model.User;

@RestController
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	UserService userService;
	
	@RequestMapping(value="/userList")
	public List<User> userList(){
		return userService.userList();
	}
	
}
