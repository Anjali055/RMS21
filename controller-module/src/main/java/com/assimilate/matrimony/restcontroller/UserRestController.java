package com.assimilate.matrimony.restcontroller;

import static common.MatrimonyConstants.API;
import static common.MatrimonyConstants.GET_ALL_USER;
import static common.MatrimonyConstants.GET_FINDUSERDELETE;
import static common.MatrimonyConstants.GET_TOTALBRIDES;
import static common.MatrimonyConstants.GET_TOTALCOUNT;
import static common.MatrimonyConstants.GET_TOTALGROOMS;
import static common.MatrimonyConstants.GET_TOTALUSERTRUE;
import static common.MatrimonyConstants.GET_USERBYID;
import static common.MatrimonyConstants.POST_USER_DETAILS;
import static common.MatrimonyConstants.POST_USER_UPDATEDELETE;
import static common.MatrimonyConstants.PUT_USERBYUPDATE;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping(API)
public class UserRestController {
	@Autowired
	private UserService userService;

	// @PostMapping("/api/create/user")
	@PostMapping(POST_USER_DETAILS)
	public User createUser(@Valid @RequestBody User user) throws Exception {
		User s = userService.createUser(user);
		return s;
	}

	// @GetMapping("/api/users/getUserById/{user_id}")
	@GetMapping(GET_USERBYID)
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

//	@GetMapping("/api/userAlluser")
	@GetMapping(GET_ALL_USER)
	public List<User> getAllUser() {
		return userService.getAllUser();
	}

//	@PutMapping("/api/users/update")
	@PutMapping(PUT_USERBYUPDATE)
	public User updateUser(@Valid @RequestBody User user) {
		System.out.println("User for update: " + user);
		userService.updateUser(user);
		System.out.println("User updated successfully..");
		return user;
	}

	// @PostMapping("/api/users/updateDelete/{user_id}")
	@PostMapping(POST_USER_UPDATEDELETE)
	public int updateDelete(@Valid @PathVariable("user_id") int user_id) {
		int u = userService.booleantrueandfalse(user_id);
		return u;
	}

	// @GetMapping("/api/userAllluser")
	@GetMapping(GET_TOTALUSERTRUE)
	public List<User> getALLWithoutDeleted() {
		return userService.booleantrue();
	}

	// @GetMapping("/api/userid/{user_id}")
	@GetMapping(GET_FINDUSERDELETE)
	public ResponseEntity<Object> deletedby(@Valid @PathVariable("user_id") int user_id) {
		try {
			User u = userService.userDeletebyId(user_id);
			if (u != null) {
				return new ResponseEntity<Object>(u, HttpStatus.OK);
			}
			String message = "User not found with id: " + user_id;
			return new ResponseEntity<Object>(message, HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Something went wrong.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// @GetMapping("/api/count")
	@GetMapping(GET_TOTALCOUNT)
	public long UsergetCount() {
		long u = userService.getcountno();
		return u;

	}

	// @GetMapping("/api/userAlllGrooms")
	@GetMapping(GET_TOTALGROOMS)
	public List<User> getALLGroomsList() {
		return userService.getAllGrooms();
	}

	// @GetMapping("/api/userAlllBridges")
	@GetMapping(GET_TOTALBRIDES)
	public List<User> getALLBridgesList() {
		return userService.getAllBridges();
	}

}
