package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.Marital_StatusRepository;
import com.assimilate.matrimony.domain.Marital_status;
import com.assimilate.matrimony.service.Marital_statusService;

@Service
public class Marital_statusServiceImpl implements Marital_statusService{

	@Autowired 
	private Marital_StatusRepository marital_statusRepository;
	
	@Override
	public void createmaritalstatuses(Marital_status marital_status) {
		
		
		marital_statusRepository.save(marital_status);
		System.out.println("service method called..........");
		
	}
	@Override
	public List<Marital_status> getMaritalStatus() {
		List<Marital_status>list=marital_statusRepository.findAll();
		return list;
	}
	

}
