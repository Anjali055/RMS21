package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.CasteRepository;
import com.assimilate.matrimony.domain.CasteEntity;
import com.assimilate.matrimony.service.CasteService;

@Service
public class CasteServiceImpl implements CasteService{

	@Autowired
	private CasteRepository casteRepository;
	@Override
	public void createcaste(CasteEntity caste) {
		
		
		casteRepository.save(caste);
	}

	@Override
	public List<CasteEntity> getAllCaste() {
		List<CasteEntity>list=casteRepository.findAll();
		return list;
	}

}
