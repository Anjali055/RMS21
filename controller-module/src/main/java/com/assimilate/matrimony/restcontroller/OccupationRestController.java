package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Occupation;
import com.assimilate.matrimony.service.OccupationService;

@RestController
public class OccupationRestController {
@Autowired
	private OccupationService occupationService;

@GetMapping("/api/Occupation/Occupations")
public List<Occupation>getAllOccupation(){
	List<Occupation>occupations=occupationService.getAllOccupation();
	
	return occupations;
	
	
}
	
	
	
}
