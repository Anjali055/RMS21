package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.CityDao;
import com.assimilate.matrimony.domain.City;
import com.assimilate.matrimony.service.CityService;

@Service
public class CityServiceImpl implements CityService {
	@Autowired
	CityDao citydao;

	@Override
	public City postCity(City city) {
		// TODO Auto-generated method stub
		return citydao.save(city);
	}


}
