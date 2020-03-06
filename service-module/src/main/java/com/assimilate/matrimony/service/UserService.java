package com.assimilate.matrimony.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.assimilate.matrimony.domain.UserDetails;

public interface UserService {

	List<UserDetails> getAllUser();

	

	String postUser(UserDetails userdetails);



	UserDetails getById(int userid);

		//-----------------soft delete---------------------//

		int deleteByid(int userid);


		//--to get all the grooms

		List<UserDetails> getAllGroom();



		int getAllUserCount();



	

}
