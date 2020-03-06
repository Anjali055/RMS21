package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Marital_status;
import com.assimilate.matrimony.domain.Religion;
import com.assimilate.matrimony.service.ReligionService;

@RestController
@RequestMapping("api/Religion")
public class ReligionController {

	@Autowired
	ReligionService religionService;
	
	@RequestMapping(path = "/createReligion")
	
	public Religion createReligion(@RequestBody Religion religion) {
		religionService.createReligion(religion);
		
		return religion;
	}
	
@RequestMapping("/getAllReligion")
	
	public List<Religion>getAllReligion(){
	List<Religion>list=religionService.getAllReligion();
		return list;
	}



	
}
