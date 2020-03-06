package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Blood_Group;
import com.assimilate.matrimony.domain.Complexion;
import com.assimilate.matrimony.service.Blood_GroupService;
import com.assimilate.matrimony.service.ComplexionService;

@RestController
@RequestMapping("api/bloodgroup")
public class Blood_GroupController {
	
	@Autowired
	private Blood_GroupService bloodgroupservice;
	
	@GetMapping("/getAll")
	public List<Blood_Group> getAll(){
		return bloodgroupservice.getBloodGroup();
	}


}
