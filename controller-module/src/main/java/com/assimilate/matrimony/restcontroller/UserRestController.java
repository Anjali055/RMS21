package com.assimilate.matrimony.restcontroller;
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
import org.springframework.web.bind.annotation.RestController;
import com.assimilate.matrimony.domain.User;
import com.assimilate.matrimony.service.UserService;

@RestController
public class UserRestController {
	@Autowired
	private UserService userService;
	@PostMapping("/api/create/user")
	public User createUser(@Valid @RequestBody User user) throws Exception {
		User s = userService.createUser(user);
		return s;
	}

	@GetMapping("/api/users/getUserById/{user_id}")
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

	@GetMapping("/api/userAlluser")
	public List<User> getAllUser() {
		return userService.getAllUser();
	}
	

	@PutMapping("/api/users/update")
	public User updateUser(@Valid @RequestBody User user) {
		System.out.println("User for update: " + user);
		userService.updateUser(user);
		System.out.println("User updated successfully..");
		return user;
	}
	

	@PostMapping("/api/users/updateDelete/{user_id}")
	public int updateDelete(@PathVariable("user_id") int user_id) {
		int u = userService.booleantrueandfalse(user_id);
		return u;
	}

	
	@GetMapping("/api/userAllluser")
	public List<User> getALLWithoutDeleted() {
		return userService.booleantrue();
	}

	
	@GetMapping("/api/userid/{user_id}")
	public ResponseEntity<Object> deletedby(@PathVariable("user_id") int user_id) {
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
}
