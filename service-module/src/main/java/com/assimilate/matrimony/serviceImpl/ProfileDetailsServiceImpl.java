package com.assimilate.matrimony.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.ProfileDetailsRepository;
import com.assimilate.matrimony.domain.ProfileDetails;
import com.assimilate.matrimony.service.ProfileDetailsService;


@Service
public class ProfileDetailsServiceImpl implements ProfileDetailsService{
	
	@Autowired
	ProfileDetailsRepository profileDetailsRepository;

	@Override
	public int updateProfileDetails(ProfileDetails profileDetails) {
		profileDetailsRepository.save(profileDetails) ;
		return profileDetails.getProfile_details_id();
	}

	@Override
	public int createProfileDetails(ProfileDetails profileDetails) {
		ProfileDetails profileFromDb= profileDetailsRepository.save(profileDetails);
		return profileFromDb.getProfile_details_id();
	}

	@Override
	public int deleteProfileDetails(int profile_details_id) {
		profileDetailsRepository.deleteById(profile_details_id);
		return 1;
	}

}
