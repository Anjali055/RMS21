package com.assimilate.matrimony.restcontroller;

import static com.assimilate.matrimony.common.MatrimonyConstants.ALL_HOROSCOPE;
import static com.assimilate.matrimony.common.MatrimonyConstants.ALL_MANGLIK;
import static com.assimilate.matrimony.common.MatrimonyConstants.ALL_MOTHERTONGUES;
import static com.assimilate.matrimony.common.MatrimonyConstants.ALL_RELIGIONS;
import static com.assimilate.matrimony.common.MatrimonyConstants.API;
import static com.assimilate.matrimony.common.MatrimonyConstants.All_MARITAL_STATUS;
import static com.assimilate.matrimony.common.MatrimonyConstants.All_USER;
import static com.assimilate.matrimony.common.MatrimonyConstants.DELETE_PROFILE_DETAILS;
import static com.assimilate.matrimony.common.MatrimonyConstants.DELETE_PROFILE_DETAILS_By_USER_ID;
import static com.assimilate.matrimony.common.MatrimonyConstants.GET_USER_BY_ID;
import static com.assimilate.matrimony.common.MatrimonyConstants.POST_PROFILE_DETAILS;
import static com.assimilate.matrimony.common.MatrimonyConstants.PROFILE_DETAILS_LIST;
import static com.assimilate.matrimony.common.MatrimonyConstants.UPDATE_PROFILE_DETAILS;
import static org.springframework.http.HttpStatus.FORBIDDEN;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.common.RecordNotFoundException;
import com.assimilate.matrimony.domain.HoroscopeEntity;
import com.assimilate.matrimony.domain.ManglikEntity;
import com.assimilate.matrimony.domain.Marital_statusEntity;
import com.assimilate.matrimony.domain.MothertongueEntity;
import com.assimilate.matrimony.domain.ProfileDetailsEntity;
import com.assimilate.matrimony.domain.ReligionEntity;
import com.assimilate.matrimony.domain.UserEntity;
import com.assimilate.matrimony.service.ProfileDetailsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(API)
public class ProfileDetailsRestController {

	@Autowired
	private ProfileDetailsService profileDetailsService;

	@PutMapping(UPDATE_PROFILE_DETAILS)
	public ResponseEntity<ProfileDetailsEntity> updateProfileDetails(@RequestBody ProfileDetailsEntity profileDetails,
			@PathVariable("user_id") int user_id, @PathVariable("profile_details_id") int profile_details_id)
			throws RecordNotFoundException {
		System.out.println("for Updating profile_details" + profileDetails);
		ProfileDetailsEntity result = profileDetailsService.updateProfileDetails(profileDetails, user_id,profile_details_id);

		return new ResponseEntity<ProfileDetailsEntity>(result, new HttpHeaders(), HttpStatus.OK);

	}

	@PostMapping(POST_PROFILE_DETAILS)

	public ResponseEntity<ProfileDetailsEntity> createProfileDetails(@RequestBody ProfileDetailsEntity profileDetails)
			throws RecordNotFoundException {

		ProfileDetailsEntity entity = profileDetailsService.createProfileDetails(profileDetails);
		return new ResponseEntity<ProfileDetailsEntity>(entity, new HttpHeaders(), HttpStatus.OK);

	}

	@DeleteMapping(DELETE_PROFILE_DETAILS)
	public HttpStatus deleteProfileDetails(@PathVariable("user_id") int user_id,@PathVariable("profile_details_id") int profile_details_id)
			throws RecordNotFoundException {

		System.out.println("Deleting Profile_details");
		profileDetailsService.deleteProfileDetails(user_id,profile_details_id);

		return FORBIDDEN;
	}

	@GetMapping(PROFILE_DETAILS_LIST)
	public ResponseEntity<List<ProfileDetailsEntity>> getAll() throws RecordNotFoundException {

		List<ProfileDetailsEntity> profile = profileDetailsService.getAll();
		return new ResponseEntity<List<ProfileDetailsEntity>>(profile, new HttpHeaders(), HttpStatus.OK);

	}

	@DeleteMapping(DELETE_PROFILE_DETAILS_By_USER_ID)

	public HttpStatus deleteprofileDetails(@PathVariable int user_id) throws RecordNotFoundException {

		profileDetailsService.deleteprofileDetails(user_id);

		return FORBIDDEN;

	}
		
		

	@GetMapping(GET_USER_BY_ID)
	
	public ResponseEntity<ProfileDetailsEntity> getUserById(@PathVariable("user_id") int user_id) throws RecordNotFoundException{
		System.out.println("fhgvhxhxxhasdhadbvb");
			ProfileDetailsEntity details = profileDetailsService.getUserById(user_id);
			return new ResponseEntity<ProfileDetailsEntity>(details,new HttpHeaders(),HttpStatus.OK);
		
	}
	
	
	@GetMapping(ALL_MOTHERTONGUES)
	public ResponseEntity<List<MothertongueEntity>> getAllMothertongue() throws RecordNotFoundException {
		
		List<MothertongueEntity> list=profileDetailsService.getAllMothertongue();
		
		return new ResponseEntity<List<MothertongueEntity>>(list,new HttpHeaders(),HttpStatus.OK);
		
	}
	
	@GetMapping(ALL_RELIGIONS)
	public ResponseEntity<List<ReligionEntity>> getAllReligion() throws RecordNotFoundException{
		List<ReligionEntity> list=profileDetailsService.getAllReligion();
		return new ResponseEntity<List<ReligionEntity>>(list,new HttpHeaders(),HttpStatus.OK);
		
	}
	
	@GetMapping(ALL_MANGLIK)
	public ResponseEntity<List<ManglikEntity>> getAllManglik() throws RecordNotFoundException{
		List<ManglikEntity> list=profileDetailsService.getAllManglik();
		return new ResponseEntity<List<ManglikEntity>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping(ALL_HOROSCOPE)
	public ResponseEntity<List<HoroscopeEntity>> getAllHoroscope() throws RecordNotFoundException{
		List<HoroscopeEntity> list=profileDetailsService.getAllHoroscope();
		return new ResponseEntity<List<HoroscopeEntity>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	
	@GetMapping(All_MARITAL_STATUS)

	public List<Marital_statusEntity> getAllMarital_Status() throws RecordNotFoundException{
		List<Marital_statusEntity> list=profileDetailsService.getAllMarital_Status();
		return list;

	public ResponseEntity<List<Marital_StatusEntity>> getAllMarital_Status() throws RecordNotFoundException{
		List<Marital_StatusEntity> list=profileDetailsService.getAllMarital_Status();
		return new ResponseEntity<List<Marital_StatusEntity>>(list,new HttpHeaders(),HttpStatus.OK);

	}
	
	@GetMapping(All_USER)
	public ResponseEntity<List<UserEntity>> getAllUser() throws RecordNotFoundException{
		List<UserEntity> list=profileDetailsService.getAllUser();
		return new ResponseEntity<List<UserEntity>>(list,new HttpHeaders(),HttpStatus.OK);
	}
	
}
