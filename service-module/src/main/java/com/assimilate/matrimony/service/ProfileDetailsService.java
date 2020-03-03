package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.HoroscopeEntity;
import com.assimilate.matrimony.domain.ManglikEntity;
import com.assimilate.matrimony.domain.Marital_StatusEntity;
import com.assimilate.matrimony.domain.MothertongueEntity;
import com.assimilate.matrimony.domain.ProfileDetailsEntity;
import com.assimilate.matrimony.domain.ReligionEntity;
import com.assimilate.matrimony.domain.UserEntity;

public interface ProfileDetailsService {

	public ProfileDetailsEntity updateProfileDetails(ProfileDetailsEntity profileDetails, int user_id, int profile_details_id);

	public ProfileDetailsEntity createProfileDetails(ProfileDetailsEntity profileDetails);

	public int deleteProfileDetails(int user_id,int profile_details_id );

	public List<ProfileDetailsEntity> getAll();

	public int deleteprofileDetails(int user_id);

	


	public ProfileDetailsEntity getUserById(int user_id);

	public List<MothertongueEntity> getAllMothertongue();

	public List<ReligionEntity> getAllReligion();

	public List<ManglikEntity> getAllManglik();

	public List<HoroscopeEntity> getAllHoroscope();

	public List<Marital_StatusEntity> getAllMarital_Status();

	public List<UserEntity> getAllUser();

	
}
