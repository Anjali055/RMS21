package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.EmployeementRepositary;
import com.assimilate.matrimony.domain.Employeement;
import com.assimilate.matrimony.service.EmployeementService;
@Service
public class EmployeementServiceImpl implements EmployeementService{

	@Autowired
	private EmployeementRepositary empservice;
	
	@Override
	public List<Employeement> getAllEmployeement() {
		return empservice.findAll();
	}


}
