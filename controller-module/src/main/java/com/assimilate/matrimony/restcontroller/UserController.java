package com.assimilate.matrimony.restcontroller;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.UserDetails;
import com.assimilate.matrimony.service.UserService;
import static com.assimilate.matrimony.constants.ControllerConstants.GET_ALL_USER;
import static com.assimilate.matrimony.constants.ControllerConstants.POST_USER;
import static com.assimilate.matrimony.constants.ControllerConstants.GET_BY_USERID;
import static com.assimilate.matrimony.constants.ControllerConstants.DELETE_BY_USERID;
import static com.assimilate.matrimony.constants.ControllerConstants.ROOT_API_URL_USER;
import static com.assimilate.matrimony.constants.ControllerConstants.GET_ALL_GROOMS;
import static com.assimilate.matrimony.constants.ControllerConstants.GET_ALL_COUNT;
@RestController
@RequestMapping(ROOT_API_URL_USER)
public class UserController {
	@Autowired
	UserService userservice;

	@GetMapping(path=GET_ALL_USER)
	public List<UserDetails> GetAllUser() {
		return userservice.getAllUser();

	}

	@PostMapping(POST_USER)
	public String postUser(@RequestBody UserDetails userdetails) {
		String password = userdetails.getPassword();
		System.out.println("password" + password);

		//-------------------------------------------------------//
		// --This will encode the password and store in the db----

		String encrypredPassword = Base64.getEncoder().encodeToString(password.getBytes());
		System.out.println("encrypted pass---------" + encrypredPassword);
		// to store the password encoded in the db//

		userdetails.setPassword(encrypredPassword);
		//-------------------------------------------//

		// --to decode the password--//
		String decodedPassword=new String(Base64.getMimeDecoder().decode(encrypredPassword));
		//System.out.println("+decodedPassword);

		return userservice.postUser(userdetails);

	}

	@GetMapping(path=GET_BY_USERID)
	public ResponseEntity<Object> getById(@PathVariable("id") int userid) {
		
		UserDetails statusOfObject=userservice.getById(userid);
	try {
			if(statusOfObject!=null) {
				return new ResponseEntity<Object>( statusOfObject,HttpStatus.OK);
			}
			
			else {
				
				String message="delete succesfully";
				return new ResponseEntity<Object>(message,HttpStatus.NOT_FOUND);
			}
		}
	catch (Exception e) {
		return new ResponseEntity<Object>("some thing went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	}

	// ----------------------soft delete based on userid-------------//
	@PostMapping(DELETE_BY_USERID)
	public int DeleteById(@PathVariable("id") int userid) {
		return userservice.deleteByid(userid);

	}
	
	
	@GetMapping(GET_ALL_GROOMS)
	public List<UserDetails> getAllGroms() {
		
			List<UserDetails> userDetailsObj=userservice.getAllGroom();
			
			return userDetailsObj ;
		
	}
	
	@GetMapping(GET_ALL_COUNT)
	public int  getAllUserCount() {
		return userservice.getAllUserCount();
	}
	

}
