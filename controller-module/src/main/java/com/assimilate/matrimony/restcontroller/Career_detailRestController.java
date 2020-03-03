package com.assimilate.matrimony.restcontroller;

import java.util.List;

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
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.CareerDetail;
import com.assimilate.matrimony.service.Career_detaiService;

@RestController
@CrossOrigin(origins = "*")
public class Career_detailRestController {

	@Autowired
	private Career_detaiService career_detaiService;

	// ______________________________________________________________________________________________

	@PostMapping("/create/Career")
	public CareerDetail postcareerDetail(@RequestBody CareerDetail careerDetail) {
		CareerDetail detail = career_detaiService.createCarrier(careerDetail);
		return detail;

	}

	// ________________________________________________________________________________________________

	@GetMapping("/api/getdetails/Carrier")
	final public List<CareerDetail> GetAllDetails() {
		return career_detaiService.getAllDetails();
	}

	// _________________________________________________________________________________________________

	@GetMapping("/api/users/getCarrierByUserId/{user_id}")
	public ResponseEntity<Object> getUserById(@PathVariable("user_id") int user_id) {
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

	@DeleteMapping("/api/users/deleteByUserId/{user_id}")
	public void deleteRecordBasedOnUSerId(@PathVariable(name = "user_id") int user_id) {
		career_detaiService.deleteRecordBasedOnUser_id(user_id);
	}

// _______________________________________________________________________________________________

@PutMapping("/api/users/updateCarrierDetailsById/{user_id}/{careerdetail_id}")
public CareerDetail updateCarrierDetailsById(@RequestBody CareerDetail careerDetail,
		@PathVariable("user_id") Integer user_id, @PathVariable("careerdetail_id") int careerdetail_id) {

	CareerDetail careerdetail = career_detaiService.updateRecordsById(user_id, careerdetail_id, careerDetail);

	return careerdetail;

}	
}