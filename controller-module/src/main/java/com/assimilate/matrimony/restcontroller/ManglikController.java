package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Manglik;
import com.assimilate.matrimony.service.ManglikService;

@RestController
public class ManglikController {

	@Autowired
	ManglikService manglikService;
	
	
	@GetMapping("/api/user/getAllManglik")
	public List<Manglik> getAllManglik()
	{
		List<Manglik> user=manglikService.getAllManglik();
		return user;
	}
	
}
