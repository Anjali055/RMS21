package com.assimilate.matrimony.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.StateDao;
import com.assimilate.matrimony.domain.Country;
import com.assimilate.matrimony.domain.State;
import com.assimilate.matrimony.service.StateService;

@Service
public class StateServiceImpl implements StateService{
	
	@Autowired
	StateDao statedao;

	@Override
	public State saveState(State state) {
		// TODO Auto-generated method stub
		return statedao.save(state);
	}

	


}
