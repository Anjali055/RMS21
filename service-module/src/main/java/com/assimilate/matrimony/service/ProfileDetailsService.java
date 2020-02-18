package com.assimilate.matrimony.service;

import com.assimilate.matrimony.domain.ProfileDetails;

public interface ProfileDetailsService {

	public int updateProfileDetails(ProfileDetails profileDetails);

	public int createProfileDetails(ProfileDetails profileDetails);

	public int deleteProfileDetails(int profile_details_id);

}
