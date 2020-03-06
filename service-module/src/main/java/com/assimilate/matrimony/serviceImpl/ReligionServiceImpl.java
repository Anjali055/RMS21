package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.ReligionRepository;
import com.assimilate.matrimony.domain.Religion;
import com.assimilate.matrimony.service.ReligionService;

@Service
public class ReligionServiceImpl implements ReligionService {
	
	@Autowired
	private ReligionRepository religionServiceRepository;
	
	

	@Override
	public List<Religion> getAllReligion() {
		List<Religion> religionEntities=religionServiceRepository.findAll();
		return religionEntities;
	}



	@Override
	public void createReligion(Religion religion) {
		// TODO Auto-generated method stub
		religionServiceRepository.save(religion);
		
	}

}
