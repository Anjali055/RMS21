package com.assimilate.matrimony.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.CasteRepository;
import com.assimilate.matrimony.dao.HoroscopeRepository;
import com.assimilate.matrimony.dao.ManglikRepository;
import com.assimilate.matrimony.dao.Marital_StatusRepository;
import com.assimilate.matrimony.dao.MothertongueRepository;
import com.assimilate.matrimony.dao.ProfileDetailsRepository;
import com.assimilate.matrimony.dao.ReligionRepository;
import com.assimilate.matrimony.dao.UserRepository;
import com.assimilate.matrimony.domain.HoroscopeEntity;
import com.assimilate.matrimony.domain.ManglikEntity;
import com.assimilate.matrimony.domain.Marital_statusEntity;
import com.assimilate.matrimony.domain.MothertongueEntity;
import com.assimilate.matrimony.domain.ProfileDetailsEntity;
import com.assimilate.matrimony.domain.ReligionEntity;
import com.assimilate.matrimony.domain.UserEntity;
import com.assimilate.matrimony.service.ProfileDetailsService;

@Service
public class ProfileDetailsServiceImpl implements ProfileDetailsService {

	@Autowired
	private ProfileDetailsRepository profileDetailsRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private MothertongueRepository mothertongueRepository;

	@Autowired

	private ReligionRepository religionRepository;

	@Autowired
	private CasteRepository casteRepository;

	@Autowired
	private ManglikRepository manglikRepository;

	@Autowired
	private HoroscopeRepository horoscopeRepository;

	@Autowired
	private Marital_StatusRepository marital_StatusRepository;

	@Override
	public ProfileDetailsEntity updateProfileDetails(ProfileDetailsEntity profileDetails, int user_id,
			int profile_details_id) {

		Optional<UserEntity> user = userRepository.findById(user_id);
		if (user != null) {
			Optional<ProfileDetailsEntity> profileDetailsEntity = profileDetailsRepository.findById(profile_details_id);

			if (profileDetailsEntity != null) {
				profileDetailsRepository.save(profileDetails);
				return profileDetails;
			} else {
				System.out.println("Profile Details Not Found");
			}

		} else {
			System.out.println("User Not Found");
		}
		ProfileDetailsEntity detailsEntity = profileDetailsRepository.save(profileDetails);
		return detailsEntity;
	}

	@Override
	public ProfileDetailsEntity createProfileDetails(ProfileDetailsEntity profileDetails) {

		MothertongueEntity mothertongueEntity = profileDetails.getMothertongue();
		Optional<MothertongueEntity> mothertongueEntity2 = mothertongueRepository
				.findById(mothertongueEntity.getMothertongue_id());

		if (mothertongueEntity2 != null) {

			ReligionEntity religionEntity = profileDetails.getReligion();
			Optional<ReligionEntity> religionEntity2 = religionRepository.findById(religionEntity.getReligion_id());
			if (religionEntity2 != null) {
				ManglikEntity manglikEntity = profileDetails.getManglik();
				Optional<ManglikEntity> manglikEntity2 = manglikRepository.findById(manglikEntity.getManglik_id());

				if (manglikEntity2 != null) {
					HoroscopeEntity horoscopeEntity = profileDetails.getHoroscope();
					Optional<HoroscopeEntity> horoscopeEntity2 = horoscopeRepository
							.findById(horoscopeEntity.getHoroscope_id());

					if (horoscopeEntity2 != null) {

						Marital_statusEntity marital_StatusEntity = profileDetails.getMarital_status();
						Optional<Marital_statusEntity> marital_StatusEntity2 = marital_StatusRepository
								.findById(manglikEntity.getManglik_id());

						if (marital_StatusEntity2 != null) {
							UserEntity userEntity = profileDetails.getUser();

							Optional<UserEntity> userEntity2 = userRepository.findById(userEntity.getUser_id());
							if (userEntity2 != null) {

								profileDetailsRepository.save(profileDetails);

							} else {
								System.out.println("Enter valid details");
							}

						} else {
							System.out.println("Marital status Not Found");

						}

					} else {
						System.out.println("Horoscope Not Found");

					}

				} else {
					System.out.println("Manglik Field Required");

				}

			} else {
				System.out.println("Religion Required");

			}

		} else {
			System.out.println("Mothertongue Required");
		}

		return profileDetails;
	}

	@Override
	public int deleteProfileDetails(int user_id, int profile_details_id) {

		userRepository.deleteById(user_id);

		profileDetailsRepository.deleteById(profile_details_id);
		return 1;
	}

	@Override
	public List<ProfileDetailsEntity> getAll() {

		List<ProfileDetailsEntity> list = profileDetailsRepository.findAll();

		return list;
	}

	@Override
	public int deleteprofileDetails(int user_id) {

		return profileDetailsRepository.deleteByUserId(user_id);
	}

//	@Override
//	public int UpdateByUserId(int user_id) {
//		int result=profileDetailsRepository.UpdateByUserId(user_id) 
//		return result;
//	}


	@Override
	public ProfileDetailsEntity getUserById(int user_id) {

		ProfileDetailsEntity en=profileDetailsRepository.findByUserId(user_id);
		
		return en;
	}

	@Override
	public List<MothertongueEntity> getAllMothertongue() {
		List<MothertongueEntity> list=mothertongueRepository.findAll();
		return list;
	}

	@Override
	public List<ReligionEntity> getAllReligion() {
		List<ReligionEntity> list=religionRepository.findAll();
		return list;
	}

	@Override
	public List<ManglikEntity> getAllManglik() {
		List<ManglikEntity> list=manglikRepository.findAll();
		return list;
	}

	@Override
	public List<HoroscopeEntity> getAllHoroscope() {
		List<HoroscopeEntity> list=horoscopeRepository.findAll();
		return list;
	}

	@Override
	public List<Marital_statusEntity> getAllMarital_Status() {
		List<Marital_statusEntity> list=marital_StatusRepository.findAll();
		return list;
	}

	@Override
	public List<UserEntity> getAllUser() {
		List<UserEntity> list=userRepository.findAll();
		return list;
	}



}
