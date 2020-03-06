package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Marital;
import com.assimilate.matrimony.service.MaritalService;

@RestController
public class MaritalController {
	
	@Autowired
	MaritalService maritalService;
	
	
	@GetMapping("/api/user/getAllMarital")
	public List<Marital> getAllMarital() {
		List<Marital> users = maritalService.getAllMarital();
		return users;
		}

}
