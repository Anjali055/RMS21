package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.Blood_GroupRepository;
import com.assimilate.matrimony.domain.Blood_Group;
import com.assimilate.matrimony.service.Blood_GroupService;

@Service
public class Blood_GroupServiceImpl implements Blood_GroupService{
	
	@Autowired
	private Blood_GroupRepository Bloodgrouprepository;

	@Override
	public List<Blood_Group> getBloodGroup() {
		// TODO Auto-generated method stub
		return Bloodgrouprepository.findAll();
	}

}
