package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Devak;
import com.assimilate.matrimony.service.DevakService;

@RestController
public class DevakController {
	
	
	@Autowired
	
	DevakService devakService;
	
	@GetMapping("/api/user/getAllDevak")
	public List<Devak> getAllDevak()
	{
		List<Devak> user=devakService.getAllDevak();
		return user;
		
	}

}
