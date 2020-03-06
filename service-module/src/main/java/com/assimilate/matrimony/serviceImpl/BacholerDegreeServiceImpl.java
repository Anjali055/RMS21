package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.BacholerDegreeRepository;
import com.assimilate.matrimony.domain.BacholerDegreeEntity;
import com.assimilate.matrimony.service.BacholerDegreeService;

@Service
public class BacholerDegreeServiceImpl implements BacholerDegreeService {
	
	@Autowired
	private BacholerDegreeRepository bacholerDegreeRepository;
	
	@Override
	public List<BacholerDegreeEntity> getBacholerDegree() {
		
		return bacholerDegreeRepository.findAll();
	}

}
