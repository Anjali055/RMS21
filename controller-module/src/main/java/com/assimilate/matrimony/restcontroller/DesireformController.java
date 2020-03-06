package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.common.RecordNotFoundException;
import com.assimilate.matrimony.domain.Desireform;
import com.assimilate.matrimony.domain.Marital_status;
import com.assimilate.matrimony.domain.Mothertongue;
import com.assimilate.matrimony.domain.UserEntity;
import com.assimilate.matrimony.service.DesireformService;
import static com.assimilate.matrimony.common.MatrimonyConstants.All_USER;
import static com.assimilate.matrimony.common.MatrimonyConstants.All_MARITAL_STATUS;
import static com.assimilate.matrimony.common.MatrimonyConstants.ALL_MOTHERTONGUES;

@RestController
@RequestMapping("api/DesireForm")
public class DesireformController {

	//private static final String[] ALL_MARITAL_STATUS = null;
	@Autowired
	private DesireformService desireformService;
	
	@RequestMapping(path = "/createDesireform")
	public Desireform createDersireform(@RequestBody Desireform desireform) {
		desireformService.createDesireforms(desireform);
		return desireform;
		
	}
	@RequestMapping("/getAllDesireform")
	public List<Desireform>getAll(){
		List<Desireform>list=desireformService.getAllDesireform();
		return list;
	}
	@GetMapping("/api/users/getDesireFormByUserId/{user_id}")
	public ResponseEntity<Object> getUserById(@PathVariable("user_id") int user_id) {
		try {
			Desireform desireform = desireformService.getUserById(user_id);
			if (desireform != null) {
				return new ResponseEntity<Object>(desireform, HttpStatus.OK);
			}
			String message = "Desire form not found with id: " + user_id;
			return new ResponseEntity<Object>(message,HttpStatus.NOT_FOUND);
		} catch (Exception e) {
			return new ResponseEntity<Object>("Something went wrong.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}	
	@DeleteMapping("/api/users/deleteByUserId/{user_id}")
	public void deleteRecordBasedOnUSerId(@PathVariable(name = "user_id") int user_id) {
		desireformService.deleteRecordBasedOnUser_id(user_id);
	}
	
	@PutMapping("/api/users/updateDesireFormById/{user_id}/{desire_form_id}")
	public Desireform updateDesireformById(@RequestBody Desireform desireform,
			@PathVariable("user_id") Integer user_id, @PathVariable("desire_form_id") int desire_form_id) {

		Desireform desireForm = desireformService.updateRecordsById(user_id, desire_form_id, desireform);

		return desireForm;

	}
	
	
	
	  @GetMapping(All_MARITAL_STATUS) 
	  public List<Marital_status> getAllMarital_Status() throws RecordNotFoundException
	  {
		  List<Marital_status>list=desireformService.getAllMarital_Status(); 
		  return list; 
	  }
	  
	  @GetMapping(ALL_MOTHERTONGUES) 
	  public ResponseEntity<List<Mothertongue>>getAllMothertongue() throws RecordNotFoundException
	  {
	  
	  List<Mothertongue> list=desireformService.getAllMothertongue();
	  
	  return new ResponseEntity<List<Mothertongue>>(list,new
	  HttpHeaders(),HttpStatus.OK);
	  
	  }
	 
	
	@GetMapping(All_USER)
	public List<UserEntity> getAllUser() throws RecordNotFoundException {
		List<UserEntity> list = desireformService.getAllUser();
		return list;
	}
	 
	
}
