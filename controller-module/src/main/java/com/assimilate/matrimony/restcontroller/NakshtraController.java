package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Nakshtra;
import com.assimilate.matrimony.service.NakshtraService;

@RestController
public class NakshtraController {
	
	@Autowired
	
	NakshtraService nakshtraService;
	
	@GetMapping("/api/user/getAllNakshtra")
	public List<Nakshtra> getAllNakshtra()
	{
		List<Nakshtra> user=nakshtraService.getAllNakshtra();
		return user;
	}

}
