package com.assimilate.matrimony.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.ProfileDetails;
import com.assimilate.matrimony.domain.Register;
import com.assimilate.matrimony.service.ProfileDetailsService;
import com.assimilate.matrimony.service.RegisterService;



@CrossOrigin(origins = "*")
@RestController
public class RegisterRestController {
	
	@Autowired
	private RegisterService registerService;
	
	@Autowired
	private ProfileDetailsService profileDetailsService;
	
	@GetMapping("/api/hello")
	public String get() {
		return "Hello World";
		
		
	}
	
	
	@PostMapping("/api/registers/create")
    public  Register createRegister(@RequestBody Register register) {
    	System.out.println("Register From Request"+register);
		registerService.createRegister(register);
		return register;
		
		
	}

				@PutMapping("/api/profileDetails/updateProfileDetails")
				public ProfileDetails updateProfileDetails(@RequestBody ProfileDetails profileDetails) {
					System.out.println("for Updating profile_details"+profileDetails);
					int result= profileDetailsService.updateProfileDetails(profileDetails);
					
					return profileDetails;
					
				}
				@PostMapping("/api/profiledetails/create_profile_details")
				
				public ProfileDetails createProfileDetails(@RequestBody ProfileDetails profileDetails ) {
					
					profileDetailsService.createProfileDetails(profileDetails);
					return profileDetails;
					
				}
				
				@DeleteMapping("/api/profiledetails/{profile_details_id}")
				public String deleteProfileDetails(@PathVariable("profile_details_id") int profile_details_id) {
					
					System.out.println("Deleting Profile_details");
					profileDetailsService.deleteProfileDetails(profile_details_id);
					
					return "Profile Delete Successfully";
			}
	}
	