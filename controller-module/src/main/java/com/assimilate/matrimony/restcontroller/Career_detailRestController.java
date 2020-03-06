package com.assimilate.matrimony.restcontroller;

import static common.MatrimonyConstants.API;
import static common.MatrimonyConstants.GET_CAREER_DETAILS2;
import static common.MatrimonyConstants.DELETE_CAREER_DETAILS3;
import static common.MatrimonyConstants.GET_CAREER_DETAILS1;
import static common.MatrimonyConstants.POST_CAREER_DETAILS;
import static common.MatrimonyConstants.UPDATE_CAREER_DETAILS4;

import java.util.List;

import javax.validation.Valid;

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

import com.assimilate.matrimony.domain.CareerDetail;
import com.assimilate.matrimony.service.Career_detaiService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(API)
public class Career_detailRestController {

	@Autowired
	private Career_detaiService career_detaiService;

	// ______________________________________________________________________________________________

	// @PostMapping("/create/Career")

	@PostMapping(POST_CAREER_DETAILS)
	public ResponseEntity<Object> postcareerDetail(@Valid @RequestBody CareerDetail careerDetail) {
		try {
			CareerDetail detail = career_detaiService.createCarrier(careerDetail);

			if (detail != null) {
				return new ResponseEntity<Object>(detail, HttpStatus.OK);
			}
			String message = "created successfully";
			return new ResponseEntity<Object>(message, HttpStatus.NOT_FOUND);
		} catch (Exception e) {

			return new ResponseEntity<Object>("something went to wrong", HttpStatus.INTERNAL_SERVER_ERROR);

		}
		// return detail;

	}

	// ________________________________________________________________________________________________

	// @GetMapping("/api/getdetails/Carrier")
	@GetMapping(GET_CAREER_DETAILS1)
	final public  List<CareerDetail> GetAllDetails() {
		return career_detaiService.getAllDetails();
	}

	// _________________________________________________________________________________________________

//	@GetMapping("/api/users/getCarrierByUserId/{user_id}")
	@GetMapping(GET_CAREER_DETAILS2)
	public ResponseEntity<Object> getUserById(@Valid @PathVariable("user_id") int user_id) {
		try {
			CareerDetail carrier = career_detaiService.getUserBy_Id(user_id);
			if (carrier != null) {
				return new ResponseEntity<Object>(carrier, HttpStatus.OK);
			}
			String message = "User not found with id: " + user_id;
			return new ResponseEntity<Object>(message, HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Something went wrong.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

// _________________________________________________________________________________________________

//	@DeleteMapping("/api/users/deleteByUserId/{user_id}")
	@DeleteMapping(DELETE_CAREER_DETAILS3)
	public void deleteRecordBasedOnUSerId(@Valid @PathVariable(name = "user_id") int user_id) {
		career_detaiService.deleteRecordBasedOnUser_id(user_id);
	}

// _______________________________________________________________________________________________

	// @PutMapping("/api/users/updateCarrierDetailsById/{user_id}/{careerdetail_id}")
	@PutMapping(UPDATE_CAREER_DETAILS4)
	public CareerDetail updateCarrierDetailsById(@Valid @RequestBody CareerDetail careerDetail,
			@PathVariable("user_id") Integer user_id, @PathVariable("careerdetail_id") int careerdetail_id) {
		CareerDetail careerdetail = career_detaiService.updateRecordsById(user_id, careerdetail_id, careerDetail);
		return careerdetail;

		
		
		
		
		//getmapping
		
	
	
		
		
	}
}