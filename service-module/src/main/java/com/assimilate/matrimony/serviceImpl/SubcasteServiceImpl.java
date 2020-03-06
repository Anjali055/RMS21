package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.SubCasteRepository;
import com.assimilate.matrimony.domain.SubcasteEntity;
import com.assimilate.matrimony.service.SubcasteService;

@Service
public class SubcasteServiceImpl implements SubcasteService{

	@Autowired
	private SubCasteRepository  subcasteRepository;

	@Override
	public void createsubcaste(SubcasteEntity subcaste) {
		
		
		subcasteRepository.save(subcaste);
	}

	@Override
	public List<SubcasteEntity> getAllSubcaste() {
		List<SubcasteEntity>list=subcasteRepository.findAll();
		return list;
	}
}
