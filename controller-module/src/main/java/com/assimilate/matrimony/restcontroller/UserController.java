package com.assimilate.matrimony.restcontroller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.User;
import com.assimilate.matrimony.service.UserService;


@RestController
@RequestMapping("api/user")
public class UserController {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UserService userService;
	
	
	
	@PostMapping("/createUser")
	public String CreateUser(@RequestBody User user) {
		userService.createUser(user);
		  return "user saved successfuly";
	}
	
	
	
	@GetMapping("/getAll")
	public List<User> getAll(){
		return userService.getUsers();
	}
	
	
	
	@GetMapping("/getUserById/{user_id}")
	public ResponseEntity<Object> getUserById(@Valid @PathVariable("user_id") int user_id) {
		try {
			User user = userService.getUserById(user_id);
			if (user != null) {
				return new ResponseEntity<Object>(user, HttpStatus.OK);
			}
			String message = "User not found with id: " + user_id;
			return new ResponseEntity<Object>(message, HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Something went wrong.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
	@PutMapping("/update")
	public User updateUser(@Valid @RequestBody User user) {
		System.out.println("User for update: " + user);
		userService.updateUser(user);
		System.out.println("User updated successfully..");
		return user;
	}
	
	
	@DeleteMapping("/delete/{user_id}")
	public ResponseEntity<Object> deletedby(@PathVariable("user_id") int user_id) {
		try {
			User user = userService.userDeletebyId(user_id);
			if (user != null) {
				return new ResponseEntity<Object>(user, HttpStatus.OK);
			}
			String message = "User not found with id: " + user_id;
			return new ResponseEntity<Object>(message, HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Something went wrong.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
package com.assimilate.matrimony.restcontroller;

import java.util.List;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
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
package com.assimilate.matrimony.restcontroller;

import static com.assimilate.matrimony.common.MatrimonyConstants.API;
import static com.assimilate.matrimony.common.MatrimonyConstants.GET_ALL_USER;
import static com.assimilate.matrimony.common.MatrimonyConstants.POST_USER_DETAILS;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.User;
import com.assimilate.matrimony.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/api/user/getAllUsers")
	public List<User> getAllUser()
	{
	List<User> user=userService.getAllUser();
	
	return user;
	}

	@PostMapping("/api/users/updateDelete/{userid}")
	public int updateDelete(@PathVariable("userid") int user_id)
	{
		System.out.println(user_id);
		
		 int u=userService.booleantrueandfalse(user_id);
		return u;
		}


@GetMapping("/api/user/Alluser")
public List<User> getALLWithoutDeleted() {
	return userService.booleantrue();
}

}


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.dao.UserRepository;
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
	
	

}

//	@PostMapping("/api/user/register")
	//public UserEntity register(@RequestBody UserEntity user)
	//{
	//	user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		//UserEntity response =  userRepository.save(user);
		
		//return response;
		
	//}

}
