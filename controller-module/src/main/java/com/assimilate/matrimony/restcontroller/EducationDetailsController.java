package com.assimilate.matrimony.restcontroller;

import static com.assimilate.matrimony.common.MatrimonyConstants.API;
import static com.assimilate.matrimony.common.MatrimonyConstants.DELETE_USER;
import static com.assimilate.matrimony.common.MatrimonyConstants.GET_ALL_EDUCATIONDETAILS;
import static com.assimilate.matrimony.common.MatrimonyConstants.GET_BRIDE_COUNT;
import static com.assimilate.matrimony.common.MatrimonyConstants.GET_USER_BY_ID_EDUCATIONDETAILS_ID;
import static com.assimilate.matrimony.common.MatrimonyConstants.POST_EDUCATION_DETAILS;

import static com.assimilate.matrimony.common.MatrimonyConstants.UPDATE_USER_BY_ID_EDUCATIONDETAILS_ID;

import java.util.List;

import org.apache.catalina.connector.Response;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.assimilate.matrimony.common.MatrimonyConstants;
import com.assimilate.matrimony.domain.EducationDetailsEntity;
import com.assimilate.matrimony.domain.UserEntity;
import com.assimilate.matrimony.service.EducationDetailsService;
import com.assimilate.matrimony.service.UserService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping(API)
public class EducationDetailsController {
	
	@Autowired  
	private  EducationDetailsService educationDetailsService;
	
	//----------------------------Create Table EducationDetails-------------------------------------------------------------
	
	@PostMapping(POST_EDUCATION_DETAILS)
    public  EducationDetailsEntity createEducationDetail(@RequestBody EducationDetailsEntity  educationDetails ){
	    educationDetailsService.createEducationDetails(educationDetails);
    	return  educationDetails;
    	
    }
	
	//@PutMapping("/api/educationdetails/updateallEducationDetails")
	//public EducationDetailsEntity updateEducationDetails(@RequestBody EducationDetailsEntity educationDetails)
	//{
	//	educationDetailsService.updateEducationDetails(educationDetails);
	//  educationDetails;
	//}
	
	//--------------------------------Delete Table using user Id Soft Delete-------------------------------------------------------

	@DeleteMapping(DELETE_USER)
	public String deleteEducationDetail(@PathVariable int user_id) 
	{
       educationDetailsService.deleteById(user_id);
	   return " EducationDetails  deleted successfully";

	}
	
	//-------------------------------Get Using User_id,EducationDetails_id------------------------------------------------------
	//classname.choosemapping   (Ctrl,shift,m)
	@GetMapping(GET_USER_BY_ID_EDUCATIONDETAILS_ID)
    public ResponseEntity<Object> getByUserId(@PathVariable ("user_id") int user_id){
	try {
		EducationDetailsEntity education=educationDetailsService.getUserById(user_id);
		
		if(education !=null) { 
		return new	ResponseEntity<Object>(education,HttpStatus.OK);
		}
		String message="user not found:" +user_id;
		return new	ResponseEntity<Object>(message,HttpStatus.NOT_FOUND);
	}catch(Exception e) {
		return new	ResponseEntity<Object>("sothing went to wrong",HttpStatus.INTERNAL_SERVER_ERROR);
	}
		
	}
	
	//--------------------------------------GET All EDucation details only ont using user_id----------------------------------------
	
	@GetMapping(GET_ALL_EDUCATIONDETAILS)
	public List<EducationDetailsEntity> getEducationDetails(){
	  return  educationDetailsService.getEducationDetails() ;
		
}
//	@GetMapping("/api/educationdetails/getUserById/{user_id}")
//	public EducationDetailsEntity getUerById(@PathVariable ("user_id") int user_id) {
//		return  educationDetailsService.getUserById(user_id);
//		
	//---------------------------Update using user_id and Education DEtails Id-----------------------------------------------------
	
	@PutMapping(UPDATE_USER_BY_ID_EDUCATIONDETAILS_ID)
	public  EducationDetailsEntity updateEducationDetailsById(@RequestBody EducationDetailsEntity  educationDetails, @PathVariable ("user_id") int user_id,@PathVariable ("education_details_id") int education_details_id) {
	
	EducationDetailsEntity result=educationDetailsService.updateEducationDetailsById(educationDetails, user_id, education_details_id);
				
		return educationDetails;
	}
	
	
	//@GetMapping(GET_BRIDE_COUNT)
	//public String getUserEntityCount(String gender){
	
	//	return educationDetailsService.getUserBrideCount(gender);
	//}
}
 