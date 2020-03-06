package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Blood_group;

public interface Blood_groupService {

	void createBlood_group(Blood_group blood_group);

	public List<Blood_group> getAllBlood_group();

}
