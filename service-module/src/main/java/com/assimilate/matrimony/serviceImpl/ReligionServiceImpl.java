package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.ReligionRepository;
import com.assimilate.matrimony.domain.Religion;
import com.assimilate.matrimony.domain.ReligionEntity;
import com.assimilate.matrimony.service.ReligionService;

@Service
public class ReligionServiceImpl implements ReligionService {

	
	@Autowired
	private ReligionRepository religionRepository;	
	
	
	public List<Religion> getUser()
	{
		 return religionRepository.findAll();
		
	}
	
	
	
	@Autowired
	private ReligionRepository religionServiceRepository;
	
	

	@Override
	public List<ReligionEntity> getAllReligion() {
		List<ReligionEntity> religionEntities=religionServiceRepository.findAll();
		return religionEntities;
	}



	@Override
	public void createReligion(ReligionEntity religion) {
		// TODO Auto-generated method stub
		religionServiceRepository.save(religion);
		
	}

}
