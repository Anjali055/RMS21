package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Country;

public interface CountryService {

	List<Country> getAllCountry();

	String SaveAllCountry(Country country);

}
