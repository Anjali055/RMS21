package com.assimilate.matrimony.restcontroller;

import static common.MatrimonyConstants.ALL_EMPLOYEEMENT;
import static common.MatrimonyConstants.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Employeement;
import com.assimilate.matrimony.service.EmployeementService;

@RestController
@RequestMapping(API)
public class EmployeementRestController {

	@Autowired
	private EmployeementService employeementService;

	// @GetMapping("/api/employeements/Employeement")
	@GetMapping(ALL_EMPLOYEEMENT)
	public List<Employeement> getAllEmployeements() {

		List<Employeement> employeements = employeementService.getAllEmployeement();
		return employeements;

	}

}
