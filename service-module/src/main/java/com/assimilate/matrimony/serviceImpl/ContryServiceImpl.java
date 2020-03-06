
package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.CountryRepositary;
import com.assimilate.matrimony.domain.Country;
import com.assimilate.matrimony.service.CountryService;

@Service
public class ContryServiceImpl implements CountryService {

	@Autowired
	private CountryRepositary countryrepositary;

	@Override
	public List<Country> getAllCountries() {
		return countryrepositary.findAll();
	}

}
