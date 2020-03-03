package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.BacholerDegree;
import com.assimilate.matrimony.service.Bachloer_DegreeService;

@RestController
public class BachloerRestController {

	@Autowired
	private Bachloer_DegreeService degreeService;
	
	@GetMapping("/api/bacholerDegrees/bacholer_Degrees")
	public List<BacholerDegree> bacholer_Degrees(){
		
		List<BacholerDegree>bdegrees=degreeService.getAllBachloerDegree();
		return bdegrees;
		
	}
}
