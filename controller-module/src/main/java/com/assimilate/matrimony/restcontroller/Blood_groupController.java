package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Blood_group;
import com.assimilate.matrimony.service.Blood_groupService;

@RestController
@RequestMapping("api/Blood_group")
public class Blood_groupController {

	@Autowired
	Blood_groupService blood_groupService;
	
	@RequestMapping(path = "/createBlood_group")
	public Blood_group createBlood_group(@RequestBody Blood_group blood_group) {
		
		blood_groupService.createBlood_group(blood_group);
		return blood_group;
	}
	
	@RequestMapping("/getAllBlood_group")
	public List<Blood_group>getAll(){
		List<Blood_group>list=blood_groupService.getAllBlood_group();
		return list;
	}
	
}
