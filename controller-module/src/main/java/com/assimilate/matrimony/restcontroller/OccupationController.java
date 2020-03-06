package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.OccupationEntity;
import com.assimilate.matrimony.service.OccupationService;

@RestController
@RequestMapping("api/Occupation")
public class OccupationController {

	
	@Autowired
	OccupationService occupationService;
	
	@RequestMapping(path = "/createOccupation")
	public OccupationEntity createOccupation(@RequestBody OccupationEntity occupation) {
		occupationService.createOccupation(occupation);
		return occupation;
	}
		
	@RequestMapping("/getAllOccupation")
	public List<OccupationEntity>getAll(){
		List<OccupationEntity>list=occupationService.getAllOccupation();
		return list;
	}
}
