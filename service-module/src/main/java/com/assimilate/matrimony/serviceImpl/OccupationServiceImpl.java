package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.OccupationRepository;
import com.assimilate.matrimony.domain.Occupation;
import com.assimilate.matrimony.service.OccupationService;

@Service
public class OccupationServiceImpl implements OccupationService{

	@Autowired
	private OccupationRepository occupationRepository;
	
	@Override
	public void createOccupation(Occupation occupation) {
		
		
		occupationRepository.save(occupation);
		
		System.out.println("service method called......");
		
	}
	@Override
	public List<Occupation> getAllOccupation() {
		List<Occupation>list=occupationRepository.findAll();
		return list;
	}

}
