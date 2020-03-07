package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.dao.UserRepository;
import com.assimilate.matrimony.domain.UserEntity;
import com.assimilate.matrimony.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private UserRepository userRepository;
	
	//@Autowired
	//private PasswordEncoder passwordEncoder;
	
	@GetMapping("/api/user/getalluser")
	public List<UserEntity> getUser(){
	  return  userService.getUser();
	  
	}
	@PostMapping("/api/user/create")
	public UserEntity createUser(@RequestBody UserEntity user) {
		userService.createUser(user);
		return user;
	}
	
//	@PostMapping("/api/user/register")
	//public UserEntity register(@RequestBody UserEntity user)
	//{
	//	user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		//UserEntity response =  userRepository.save(user);
		
		//return response;
		
	//}

}
