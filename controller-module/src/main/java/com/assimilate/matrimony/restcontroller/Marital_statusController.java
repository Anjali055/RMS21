package com.assimilate.matrimony.restcontroller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Marital_statusEntity;
import com.assimilate.matrimony.service.Marital_statusService;

@RestController
@RequestMapping("api/Marital_Status")
public class Marital_statusController {

	@Autowired
	Marital_statusService marital_statusService;
	
	
	@RequestMapping(path = "/createMaritalStatus")
	public Marital_statusEntity createmaritalstatus(@RequestBody Marital_statusEntity marital_status) {
		marital_statusService.createmaritalstatuses(marital_status);
		return marital_status;
		
	}
	
	
	@RequestMapping("/getAllMarital_status")
	
	public List<Marital_statusEntity>getAllMaritalStatus(){
		List<Marital_statusEntity>list=marital_statusService.getMaritalStatus();
		return list;
	}
}
