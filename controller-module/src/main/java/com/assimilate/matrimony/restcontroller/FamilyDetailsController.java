	package com.assimilate.matrimony.restcontroller;

import java.util.List;
import static com.assimilate.matrimony.constants.ControllerConstants.*;
import java.util.Optional;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.FamilyDetails;
import com.assimilate.matrimony.domain.UserDetails;
import com.assimilate.matrimony.service.FamilyDetailsService;

@RestController
@RequestMapping(ROOT_API_FAMILYDETAILS)
@CrossOrigin(origins ="*")
public class FamilyDetailsController {
	
	@Autowired
	FamilyDetailsService familydetailsservice;
	
	
	
	@PostMapping(SAVE_FAMILYDETAILS)
	public FamilyDetails  postUser( @RequestBody FamilyDetails familyDetails) {
		
		System.out.println("f"+familyDetails);
		
			FamilyDetails familydetails= familydetailsservice.postUser(familyDetails);
				
			return familydetails;
			
		
		}
	
	@CrossOrigin("*")
	@GetMapping(GET_ALL_FAMILYDETAILS)
	public List<FamilyDetails> GetAllUser(){
		
		List<FamilyDetails> familyDetails= familydetailsservice.getAllUser();
		return familyDetails;
		
	}
	
	
	@GetMapping(GET_ALL_FAMILYDETAILS_BY_USERID)
	public FamilyDetails getByUserId(@PathVariable("uid")int uid) {
		return familydetailsservice.getByUserId(uid);
		
	}
	
	//-----------------get byfamilyid------------------------------------------------------------
	
	@GetMapping(GET_ALL_FAMILYDETAILS_BY_FAMILYID)
	public Optional<FamilyDetails> getByFamilyID(@PathVariable("fid")int fid) {
		
		return familydetailsservice.getByFamilyId(fid);
	}
	
	
	//--------------------------------------------------------------------------------------------
	//--update mapping 
	@PutMapping(path="/postbyfmailyid")
	public FamilyDetails updateFamilyDetailsById(@RequestParam(name="family_id")int family_id,@RequestBody FamilyDetails familydetails){
	
		System.out.println("---------------------------"+family_id);
		System.out.println("+++++++++++++++++++++++++"+familydetails.getCountry());
	return familydetailsservice.updateFamilyDetailsById(family_id,familydetails);
		
		//return null;
		
	}
	
	@PutMapping(path="/postbyuserid")
	public FamilyDetails updateFamilyDetailsByUserid(@RequestParam(name="user_id")int user_id,@RequestBody FamilyDetails familydetails){
		
		return familydetailsservice.updateFamilyDetailsByUserid(user_id,familydetails);
		
		
		
	}
	
	
	//--------------------------------------------------------------------------
	@PutMapping(UPDATE_BASED_ON_USERID_FAMILYDETAILSID)
	public FamilyDetails updateFamilyDetialsByUseridandFamilyid(@RequestBody FamilyDetails familydetalils,
			@PathVariable("user_id") int user_id,@PathVariable("family_id") int family_id){
		int familydetailsobj= familydetailsservice.updateFamilyDetialsByUseridandFamilyid(familydetalils,user_id,family_id);
		
		return familydetalils;
	}
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

}
