package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.MothertongueRepository;
import com.assimilate.matrimony.domain.Mothertongue;
import com.assimilate.matrimony.service.MothertongueService;

@Service
public class MothertongueServiceImpl implements MothertongueService{

	
	@Autowired
	private MothertongueRepository mothertongueRepository;

	@Override
	public void createMothertongue(Mothertongue mothertongue) {
		
		
		mothertongueRepository.save(mothertongue);
		System.out.println("service method called...........");
	}

	@Override
	public List<Mothertongue> geAllMothertongue() {
		List<Mothertongue>list=mothertongueRepository.findAll();
		return list;
	}

	
}
