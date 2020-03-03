package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.ReligionEntity;
import com.assimilate.matrimony.service.ReligionService;

@RestController
public class ReligionRestController {
	
	@Autowired
	private ReligionService religionService;
	
	
	@GetMapping("/api/getAllReligion")
	
	public List<ReligionEntity> getAllReligion() {
		
		List<ReligionEntity> list=religionService.getAllReligion();
		return list;
		
		
		
	}
	

}
