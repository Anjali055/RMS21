package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Blood_GroupEntity;

public interface Blood_groupService {

	void createBlood_group(Blood_GroupEntity blood_group);

	public List<Blood_GroupEntity> getAllBlood_group();

}
