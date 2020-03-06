package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.Blood_groupRepository;
import com.assimilate.matrimony.domain.Blood_group;
import com.assimilate.matrimony.service.Blood_groupService;

@Service
public class Blood_groupServiceImpl implements Blood_groupService{

	@Autowired
	Blood_groupRepository bloodRepository;
	@Override
	public void createBlood_group(Blood_group blood_group) {
		// TODO Auto-generated method stub
		
		bloodRepository.save(blood_group);
	}
	@Override
	public List<Blood_group> getAllBlood_group() {
		List<Blood_group>list=bloodRepository.findAll();
		return list;
	}

}
