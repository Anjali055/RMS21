package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.OccupationRepository;
import com.assimilate.matrimony.domain.OccupationEntity;
import com.assimilate.matrimony.service.OccupationService;

@Service
public class OccupationServiceImpl implements OccupationService{

	@Autowired
	private OccupationRepository occupationRepository;
	
	@Override
	public void createOccupation(OccupationEntity occupation) {
		
		
		occupationRepository.save(occupation);
		
		System.out.println("service method called......");
		
	}
	@Override
	public List<OccupationEntity> getAllOccupation() {
		List<OccupationEntity>list=occupationRepository.findAll();
		return list;
	}

}
package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.OccupationRepositary;
import com.assimilate.matrimony.domain.Occupation;
import com.assimilate.matrimony.service.OccupationService;

@Service
public class OccupationServiceImpl implements OccupationService{

	@Autowired
	private OccupationRepositary occupationrepositary;
	
	@Override
	public List<Occupation> getAllOccupation() {
		return occupationrepositary.findAll();
	}

}
