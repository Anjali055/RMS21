package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Country;
import com.assimilate.matrimony.service.CountryService;
import static com.assimilate.matrimony.constants.ControllerConstants.ROOT_API_COUNTRY;

import static com.assimilate.matrimony.constants.ControllerConstants.SAVE_COUNTRY;

import static com.assimilate.matrimony.constants.ControllerConstants.GET_ALL_COUNTRY;

@RestController
@RequestMapping(ROOT_API_COUNTRY)
public class CountryController {

	
	@Autowired
	CountryService countryservice;
	
	
	@RequestMapping(GET_ALL_COUNTRY)
	public  List<Country> getAllCountry() {
		
		return countryservice.getAllCountry();
		
	}
	
	
	@PostMapping(SAVE_COUNTRY)
	public String  SaveAllCountry(@RequestBody Country country) {
		return countryservice.SaveAllCountry(country);
		
	}
	
}
