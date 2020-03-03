package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.MasterDegree;
import com.assimilate.matrimony.service.Master_degreeService;

@RestController
public class MasterRestController {

	@Autowired
	private Master_degreeService master_degreeService;
	
	
	@GetMapping("/api/masterDegree/masterdegrees")
	public List<MasterDegree> masterdegrees(){
		List<MasterDegree> degrees=master_degreeService.getAllMasterDegree();
		return degrees;
		
	}	
}
