package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.DevakRepository;
import com.assimilate.matrimony.domain.Devak;
import com.assimilate.matrimony.service.DevakService;

@Service
public class DevakServiceImpl implements DevakService {
	
	@Autowired
	
	DevakRepository devakRepository;

	@Override
	public List<Devak> getAllDevak() {
		return devakRepository.findAll();
		
	}

}
