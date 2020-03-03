package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Employeement;
import com.assimilate.matrimony.service.EmployeementService;

@RestController
public class EmployeementRestController {

	@Autowired
	private EmployeementService employeementService;
	
	@GetMapping("/api/employeements/Employeement")
	public List<Employeement>getAllEmployeements(){
		
		List<Employeement>employeements=employeementService.getAllEmployeement();
		return employeements;
		
	}
	
	
	
}
