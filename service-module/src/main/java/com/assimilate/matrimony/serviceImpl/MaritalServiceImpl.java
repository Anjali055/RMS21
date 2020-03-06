package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.MaritalRepository;
import com.assimilate.matrimony.domain.Marital;
import com.assimilate.matrimony.service.MaritalService;

@Service
public class MaritalServiceImpl implements MaritalService {

	
	@Autowired 
	MaritalRepository maritalRepository;
	@Override
	public List<Marital> getAllMarital() {
		return maritalRepository.findAll();
		
	}

}
