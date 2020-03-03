package com.assimilate.matrimony.restcontroller;

import static com.assimilate.matrimony.common.MatrimonyConstants.API;
import static com.assimilate.matrimony.common.MatrimonyConstants.GET_ALL_USER;
import static com.assimilate.matrimony.common.MatrimonyConstants.POST_USER_DETAILS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.UserEntity;
import com.assimilate.matrimony.service.UserService;

@RestController
@RequestMapping(API)
public class UserController {
	
	@Autowired
	private UserService userService;
	@GetMapping(GET_ALL_USER)
	public List<UserEntity> getUser(){
	  return  userService.getUser();
		
	}
	
	@PostMapping(POST_USER_DETAILS)
	
	public UserEntity createUser(@RequestBody UserEntity user) {
		
		userService.createUser(user);
		return user;
	}

}