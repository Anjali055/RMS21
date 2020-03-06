package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.SubcasteEntity;
import com.assimilate.matrimony.service.SubcasteService;

@RestController
@RequestMapping("api/Subcaste")
public class SubcasteController {

	
	@Autowired
	SubcasteService subcasteService;
	
	
	
	@RequestMapping(path = "/createSubcaste")
	public SubcasteEntity createsubcaste(@RequestBody SubcasteEntity subcaste) {
		subcasteService.createsubcaste(subcaste);
		
		return subcaste;
		
	}
	
	
	@RequestMapping("/getAllSubcaste")
	
	public List<SubcasteEntity>getAllSubcaste(){
		List<SubcasteEntity>list=subcasteService.getAllSubcaste();
		return list;
	}
}
