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
	private ReligionRepository religionRepository;	
	
	
	public List<Religion> getUser()
	{
		 return religionRepository.findAll();
		
	}
	
	
}
