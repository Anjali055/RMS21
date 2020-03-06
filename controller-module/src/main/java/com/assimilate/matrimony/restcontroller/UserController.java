package com.assimilate.matrimony.restcontroller;

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


