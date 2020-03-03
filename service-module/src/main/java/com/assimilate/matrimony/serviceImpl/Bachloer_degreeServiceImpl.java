package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.Bachleor_degreeRepositary;
import com.assimilate.matrimony.domain.BacholerDegree;
import com.assimilate.matrimony.service.Bachloer_DegreeService;
@Service
public class Bachloer_degreeServiceImpl implements Bachloer_DegreeService  {

	@Autowired
	private Bachleor_degreeRepositary bachleor_degreeRepositary;
	
	@Override
	public List<BacholerDegree> getAllBachloerDegree() {
		return bachleor_degreeRepositary.findAll() ;
	}

	
	
}
