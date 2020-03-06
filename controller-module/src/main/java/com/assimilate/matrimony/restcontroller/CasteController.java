package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.CasteEntity;
import com.assimilate.matrimony.service.CasteService;

@RestController
@RequestMapping("api/Caste")
public class CasteController {

	@Autowired
	
	CasteService casteService;
	
	@RequestMapping(path = "/createCaste")
	public CasteEntity createcaste(@RequestBody CasteEntity caste) {
		casteService.createcaste(caste);
		return caste;
		
	}

	@RequestMapping("/getAllCaste")
	
	public List<CasteEntity>getAllCaste(){
		List<CasteEntity>list=casteService.getAllCaste();
		return list;
	}
}
