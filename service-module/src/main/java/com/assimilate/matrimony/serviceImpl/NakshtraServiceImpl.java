package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.NakshtraRepository;
import com.assimilate.matrimony.domain.Nakshtra;
import com.assimilate.matrimony.service.NakshtraService;

@Service
public class NakshtraServiceImpl implements NakshtraService {
	
	
	@Autowired
	NakshtraRepository nakshtraRepository;

	@Override
	public List<Nakshtra> getAllNakshtra() {
		return nakshtraRepository.findAll();
		
	}
	
}
