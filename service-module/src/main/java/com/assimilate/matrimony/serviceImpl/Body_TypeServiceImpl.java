package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.Body_TypeRepository;
import com.assimilate.matrimony.domain.Body_Type;
import com.assimilate.matrimony.service.Body_TypeService;

@Service
public class Body_TypeServiceImpl implements Body_TypeService{
	
	@Autowired
	private Body_TypeRepository bodytypeRepository;

	@Override
	public List<Body_Type> getBodyType() {
		// TODO Auto-generated method stub
		return bodytypeRepository.findAll();
	}

}
