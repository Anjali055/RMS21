package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.Body_typeRepository;
import com.assimilate.matrimony.domain.Body_type;
import com.assimilate.matrimony.service.Body_typeService;

@Service
public class Body_typeServiceImpl implements Body_typeService{

	@Autowired
	private Body_typeRepository body_typeRepository;

	@Override
	public void createBody_type(Body_type body_type) {
		
		body_typeRepository.save(body_type);
	}

	@Override
	public List<Body_type> getAllBody_type() {
		List<Body_type>list=body_typeRepository.findAll();
		return list;
	}
}
