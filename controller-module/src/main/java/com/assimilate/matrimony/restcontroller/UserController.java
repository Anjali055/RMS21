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
