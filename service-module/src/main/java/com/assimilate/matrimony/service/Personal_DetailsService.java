package com.assimilate.matrimony.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assimilate.matrimony.domain.Personal_Details;


public interface Personal_DetailsService {

	int createPersonalDetails(Personal_Details personalDetail);

	List<Personal_Details> getAllPersonalDetails();

	Personal_Details getPersonalDetailByUserId(int user_id);

	//int deletePersonalDetailsById(int user_id);

	Personal_Details updatePersonalDetails(Personal_Details personalDetail, int user_id, int personaldetails_id);

	public int deleteById(int user_id);


	
}
