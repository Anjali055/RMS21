package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.HoroscopeEntity;
import com.assimilate.matrimony.service.HoroscopeService;

@RestController
@RequestMapping("api/Horoscope")
public class HoroscopeController {

	
	@Autowired
	HoroscopeService horoscopeService;
	
	@RequestMapping(path = "/createHoroscope")
	public HoroscopeEntity createHoroscope(@RequestBody HoroscopeEntity horoscope) {
		
		horoscopeService.createHoroscope(horoscope);
		return horoscope;
	}
	
	@RequestMapping("/getAllHoroscope")
	public List<HoroscopeEntity>getAllHoroscope(){
		List<HoroscopeEntity>list=horoscopeService.getAllHoroscope();
		return list;
		
	}
}
