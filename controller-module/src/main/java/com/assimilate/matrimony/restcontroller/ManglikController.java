package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Manglik;
import com.assimilate.matrimony.service.ManglikService;

@RestController
@RequestMapping("api/Manglik")
public class ManglikController {

	@Autowired
	ManglikService manglikService;
	
	@RequestMapping(path = "/createManglik")
	public Manglik createManglik(@RequestBody Manglik manglik) {
		manglikService.createManglik(manglik);
		return manglik;
	}
	
	@RequestMapping("/getAllManglik")
	public List<Manglik>getAllManglik(){
		List<Manglik>list=manglikService.getAllManglik();
		return list;
	}
}
