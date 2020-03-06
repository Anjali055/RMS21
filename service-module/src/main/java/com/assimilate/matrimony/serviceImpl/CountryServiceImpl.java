package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.CountryDao;
import com.assimilate.matrimony.domain.Country;
import com.assimilate.matrimony.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	CountryDao countrydao;
	

	@Override
	public List<Country> getAllCountry() {
		// TODO Auto-generated method stub
		return countrydao.findAll();
	}


	@Override
	public String SaveAllCountry(Country country) {
		String result="record inserted succesfully";
		Country countryobj=countrydao.save(country);
		if(countryobj==null) {
			return result="Failed to insert the record";
		}
		return result;
	}

}
