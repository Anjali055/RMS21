package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Horoscope;
import com.assimilate.matrimony.domain.Manglik;
import com.assimilate.matrimony.domain.Marital_status;
import com.assimilate.matrimony.domain.Mothertongue;
import com.assimilate.matrimony.domain.ProfileDetailsEntity;
import com.assimilate.matrimony.domain.Religion;
import com.assimilate.matrimony.domain.UserEntity;

public interface ProfileDetailsService {

	public ProfileDetailsEntity updateProfileDetails(ProfileDetailsEntity profileDetails, int user_id, int profile_details_id);

	public ProfileDetailsEntity createProfileDetails(ProfileDetailsEntity profileDetails);

	public int deleteProfileDetails(int user_id,int profile_details_id );

	public List<ProfileDetailsEntity> getAll();

	public int deleteprofileDetails(int user_id);

	


	public ProfileDetailsEntity getUserById(int user_id);

	public List<Mothertongue> getAllMothertongue();

	public List<Religion> getAllReligion();

	public List<Manglik> getAllManglik();

	public List<Horoscope> getAllHoroscope();

	public List<Marital_status> getAllMarital_Status();

	public List<UserEntity> getAllUser();

	
}
