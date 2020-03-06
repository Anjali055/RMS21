package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.MothertongueRepository;
import com.assimilate.matrimony.domain.MothertongueEntity;
import com.assimilate.matrimony.service.MothertongueService;

@Service
public class MothertongueServiceImpl implements MothertongueService{

	
	@Autowired
	private MothertongueRepository mothertongueRepository;

	@Override
	public void createMothertongue(MothertongueEntity mothertongue) {
		
		
		mothertongueRepository.save(mothertongue);
		System.out.println("service method called...........");
	}

	@Override
	public List<MothertongueEntity> geAllMothertongue() {
		List<MothertongueEntity>list=mothertongueRepository.findAll();
		return list;
	}

	
}
