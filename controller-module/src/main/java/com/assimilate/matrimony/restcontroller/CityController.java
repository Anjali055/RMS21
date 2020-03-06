package com.assimilate.matrimony.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.City;
import com.assimilate.matrimony.service.CityService;
import static com.assimilate.matrimony.constants.ControllerConstants.ROOT_API_CITY;
import static com.assimilate.matrimony.constants.ControllerConstants.SAVE_CITY;

@RestController
@RequestMapping(ROOT_API_CITY)
public class CityController {
	@Autowired
	CityService cityservice;

	@PostMapping(SAVE_CITY)
	public City postCity(@RequestBody City city) {
		return cityservice.postCity(city);

	}

}
 