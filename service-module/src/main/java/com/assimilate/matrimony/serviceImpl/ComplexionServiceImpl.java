package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.ComplexionRepository;
import com.assimilate.matrimony.domain.Complexion;
import com.assimilate.matrimony.domain.User;
import com.assimilate.matrimony.service.ComplexionService;

@Service
public class ComplexionServiceImpl implements ComplexionService{
	@Autowired
	ComplexionRepository complexionrepository;

	@Override
	public List<Complexion> getComplexion() {
		
		return complexionrepository.findAll();
	}

}
