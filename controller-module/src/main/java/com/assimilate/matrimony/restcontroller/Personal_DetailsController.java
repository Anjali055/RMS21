package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.assimilate.matrimony.domain.Personal_Details;
import com.assimilate.matrimony.service.Personal_DetailsService;

@RestController
@CrossOrigin("*")
public class Personal_DetailsController {
	
	@Autowired
	private Personal_DetailsService   personalDetailsService;
	
//***********************Based on Personal Detail*************************************************

	@RequestMapping("/api/personaldetails/create")
	public Personal_Details createPersonalDetail(@RequestBody Personal_Details personalDetail) {
		personalDetailsService.createPersonalDetails(personalDetail);
		return personalDetail;
	}
	
	
	@GetMapping("/api/personaldetails/getAll")
	public List<Personal_Details> getAll(){
		return personalDetailsService.getAllPersonalDetails();
	}
	
	
	
//***********************Based on User Id*********************************************************
	
	@GetMapping("/api/personaldetails/getByUserId/{user_id}")
	public Personal_Details getByUsetId(@PathVariable int user_id) {
	return personalDetailsService.getPersonalDetailByUserId(user_id);
	}
	
	
	
	@DeleteMapping("/api/personaldetails/delete/{user_id}")
	public String deleteByUserId(@PathVariable int user_id) {
		personalDetailsService.deleteById(user_id);
		return "deleted successfully";
	}
	
	
//***********************Based on User Id and Personal Detail******************************************	

	@PutMapping("/api/personaldetails/update/{user_id}/{personaldetails_id}")
	   public Personal_Details updatePersonalDetails(@RequestBody Personal_Details personalDetail, @PathVariable("user_id") int user_id, @PathVariable("personaldetails_id") int personaldetails_id) {
			Personal_Details result = personalDetailsService.updatePersonalDetails(personalDetail, user_id, personaldetails_id);
		   return personalDetail;	
	}
}
