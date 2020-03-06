package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Religion;

public interface ReligionService {

	public List<Religion> getUser();

	

	
import com.assimilate.matrimony.domain.ReligionEntity;


public interface ReligionService {

	public List<ReligionEntity> getAllReligion();

	public void createReligion(ReligionEntity religion);

}
