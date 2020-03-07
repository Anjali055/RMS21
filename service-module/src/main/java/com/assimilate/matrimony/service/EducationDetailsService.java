package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.EducationDetailsEntity;
import com.assimilate.matrimony.domain.ProfileDetails;
import com.assimilate.matrimony.domain.UserEntity;

public interface EducationDetailsService {
	//public int updateEducationDetails(EducationDetailsEntity educationDetails);

	public int createEducationDetails(EducationDetailsEntity educationDetails);
   
	public List<EducationDetailsEntity> getEducationDetails();



	public EducationDetailsEntity  getUserById(int user_id);
	
		
    public EducationDetailsEntity updateEducationDetailsById(EducationDetailsEntity educationDetails, int user_id,int education_details_id);

	public int deleteById(int user_id);
//
//	  public EducationDetailsEntity getUserById(int user_id);
		
	  

	//public List<UserEntity> getUserBrideCount();

	//public String getUserBrideCount(String gender);
		
}
