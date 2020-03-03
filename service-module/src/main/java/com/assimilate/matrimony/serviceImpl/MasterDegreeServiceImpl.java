package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.Master_degreeRepositary;
import com.assimilate.matrimony.domain.MasterDegree;
import com.assimilate.matrimony.service.Master_degreeService;

@Service
public class MasterDegreeServiceImpl implements Master_degreeService {

	@Autowired
	private Master_degreeRepositary masterDegreerepositary;

	@Override
	public List<MasterDegree> getAllMasterDegree() {
		
		return masterDegreerepositary.findAll();
	}
	
}
