package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.ReligionRepository;
<<<<<<< HEAD
import com.assimilate.matrimony.domain.Religion;
=======
import com.assimilate.matrimony.domain.ReligionEntity;
>>>>>>> f981900817d7a49a6148140e8821500d94310551
import com.assimilate.matrimony.service.ReligionService;

@Service
public class ReligionServiceImpl implements ReligionService {
<<<<<<< HEAD

	
	@Autowired
	private ReligionRepository religionRepository;	
	
	
	public List<Religion> getUser()
	{
		 return religionRepository.findAll();
		
	}
	
	
=======
	
	@Autowired
	private ReligionRepository religionServiceRepository;
	
	

	@Override
	public List<ReligionEntity> getAllReligion() {
		List<ReligionEntity> religionEntities=religionServiceRepository.findAll();
		return religionEntities;
	}

>>>>>>> f981900817d7a49a6148140e8821500d94310551
}
