package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Occupation;
import com.assimilate.matrimony.service.OccupationService;

@RestController
@RequestMapping("api/Occupation")
public class OccupationController {

	
	@Autowired
	OccupationService occupationService;
	
	@RequestMapping(path = "/createOccupation")
	public Occupation createOccupation(@RequestBody Occupation occupation) {
		occupationService.createOccupation(occupation);
		return occupation;
	}
		
	@RequestMapping("/getAllOccupation")
	public List<Occupation>getAll(){
		List<Occupation>list=occupationService.getAllOccupation();
		return list;
	}
}
