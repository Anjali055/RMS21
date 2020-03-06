package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.GotraRepository;
import com.assimilate.matrimony.domain.Gotra;
import com.assimilate.matrimony.service.GotraService;
@Service
public class GotraServiceImpl implements GotraService {
	
	
	
	@Autowired
	GotraRepository gotraRepository;

	@Override
	public List<Gotra> getAllGotra() {
		
		return gotraRepository.findAll();
		
	}
	
}
