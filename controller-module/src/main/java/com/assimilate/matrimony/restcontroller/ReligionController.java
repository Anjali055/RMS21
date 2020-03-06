package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
