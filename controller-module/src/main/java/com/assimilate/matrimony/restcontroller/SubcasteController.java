package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Subcaste;
import com.assimilate.matrimony.service.SubcasteService;

@RestController
@RequestMapping("api/Subcaste")
public class SubcasteController {

	
	@Autowired
	SubcasteService subcasteService;
	
	
	
	@RequestMapping(path = "/createSubcaste")
	public Subcaste createsubcaste(@RequestBody Subcaste subcaste) {
		subcasteService.createsubcaste(subcaste);
		
		return subcaste;
		
	}
	
	
	@RequestMapping("/getAllSubcaste")
	
	public List<Subcaste>getAllSubcaste(){
		List<Subcaste>list=subcasteService.getAllSubcaste();
		return list;
	}
}
