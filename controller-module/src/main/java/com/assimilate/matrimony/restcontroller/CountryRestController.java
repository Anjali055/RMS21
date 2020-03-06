
package com.assimilate.matrimony.restcontroller;

import static common.MatrimonyConstants.ALL_COUNTRIES;
import static common.MatrimonyConstants.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Country;
import com.assimilate.matrimony.service.CountryService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(API)
public class CountryRestController {

	@Autowired
	private CountryService countryService;
//	@Autowired
//	private StateServices stateService;

	// @GetMapping("/api/countries/countries")
	@GetMapping(ALL_COUNTRIES)
	public List<Country> getAllCountries() {
		List<Country> countries = countryService.getAllCountries();
		return countries;

	}

}
