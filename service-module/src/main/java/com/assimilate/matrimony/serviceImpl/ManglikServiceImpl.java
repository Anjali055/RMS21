package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.ManglikRepository;
import com.assimilate.matrimony.domain.Manglik;
import com.assimilate.matrimony.service.ManglikService;

@Service
public class ManglikServiceImpl implements ManglikService {

	
	@Autowired
	ManglikRepository manglikRepository;

	@Override
	public List<Manglik> getAllManglik() {
		return manglikRepository.findAll();
		
	}
	


}
