package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Gotra;
import com.assimilate.matrimony.service.GotraService;

@RestController
public class GotraController {
	
	@Autowired
	GotraService gotraService;
	@GetMapping("/api/user/getAllGotra")
	public List<Gotra> getAllGotra()
	{
		List<Gotra> user=gotraService.getAllGotra();
		return user;
		
	}
	

}
