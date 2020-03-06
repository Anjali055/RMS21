package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Horoscope;
import com.assimilate.matrimony.service.HoroscopeService;

@RestController
public class HoroscopeController {

	@Autowired
	
	HoroscopeService horoscopeService;
	
	@GetMapping("/api/user/getAllHoroscope")
	public List<Horoscope> getAllHoroscope()
	{
		List<Horoscope> user=horoscopeService.getAllHoroscope();
		return user;
	}
	
	
	
}
