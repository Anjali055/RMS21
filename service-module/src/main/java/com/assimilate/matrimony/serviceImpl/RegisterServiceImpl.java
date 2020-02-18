package com.assimilate.matrimony.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.RegisterRepository;
import com.assimilate.matrimony.domain.Register;
import com.assimilate.matrimony.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService{
	
	
	@Autowired
	 private RegisterRepository registerRepository;

	@Override
	public int createRegister(Register register) {
		Register registerFromDb= registerRepository.save(register);
		return registerFromDb.getId();
	}

	
	
}
