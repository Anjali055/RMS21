package com.assimilate.matrimony.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.assimilate.matrimony.domain.FamilyDetails;


@Service
public interface FamilyDetailsService {

	FamilyDetails postUser(FamilyDetails familyDetails);

	List<FamilyDetails> getAllUser();

	FamilyDetails getByUserId(int uid);

	FamilyDetails updateFamilyDetailsById(int uid, FamilyDetails familydetails);
	
	//update based on the userid

	FamilyDetails updateFamilyDetailsByUserid(int user_id, FamilyDetails familydetails);
//------------------------------------------------------------------------------------------------------------
	
	int updateFamilyDetialsByUseridandFamilyid(FamilyDetails familydetalils,int user_id, int family_id);
	
	//-----------------------------getbyfamilyid--------------------------------

	Optional<FamilyDetails> getByFamilyId(int fid);


	



	

}
