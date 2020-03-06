package com.assimilate.matrimony.restcontroller;

<<<<<<< HEAD
=======
import static com.assimilate.matrimony.common.MatrimonyConstants.API;
import static com.assimilate.matrimony.common.MatrimonyConstants.GET_ALL_USER;
import static com.assimilate.matrimony.common.MatrimonyConstants.POST_USER_DETAILS;

>>>>>>> f981900817d7a49a6148140e8821500d94310551
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
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


=======
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
>>>>>>> f981900817d7a49a6148140e8821500d94310551
