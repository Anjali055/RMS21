package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.ComplexionRepository;
import com.assimilate.matrimony.domain.ComplexionEntity;
import com.assimilate.matrimony.service.ComplexionService;

@Service
public class ComplexionServiceImpl implements ComplexionService{

	@Autowired
	private ComplexionRepository complexionRepository;

	@Override
	public void createComplexion(ComplexionEntity complexion) {
		
		complexionRepository.save(complexion);
	}

	@Override
	public List<ComplexionEntity> getAllComplexion() {
		List<ComplexionEntity>list=complexionRepository.findAll();
		return list;
	}
}
