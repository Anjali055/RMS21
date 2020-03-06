package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Marital_statusEntity;
import com.assimilate.matrimony.domain.ReligionEntity;
import com.assimilate.matrimony.service.ReligionService;

@RestController
@RequestMapping("api/Religion")
public class ReligionController {

	@Autowired
	ReligionService religionService;
	
	@RequestMapping(path = "/createReligion")
	
	public ReligionEntity createReligion(@RequestBody ReligionEntity religion) {
		religionService.createReligion(religion);
		
		return religion;
	}
	
@RequestMapping("/getAllReligion")
	
	public List<ReligionEntity>getAllReligion(){
	List<ReligionEntity>list=religionService.getAllReligion();
		return list;
	}



	
}
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Religion;
import com.assimilate.matrimony.service.ReligionService;

@RestController
public class ReligionController {
	
	
	@Autowired
	private ReligionService religionService;
	
	
	@GetMapping("/api/user/getAllReligion")
	public List<Religion> getUser()
	{
		List<Religion> user= religionService.getUser();
		return user;
	}
	
	}

