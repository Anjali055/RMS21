package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.SubCasteRepository;
import com.assimilate.matrimony.domain.Subcaste;
import com.assimilate.matrimony.service.SubcasteService;

@Service
public class SubcasteServiceImpl implements SubcasteService{

	@Autowired
	private SubCasteRepository  subcasteRepository;

	@Override
	public void createsubcaste(Subcaste subcaste) {
		
		
		subcasteRepository.save(subcaste);
	}

	@Override
	public List<Subcaste> getAllSubcaste() {
		List<Subcaste>list=subcasteRepository.findAll();
		return list;
	}
}
