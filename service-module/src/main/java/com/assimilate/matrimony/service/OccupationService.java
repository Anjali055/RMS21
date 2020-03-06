package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Occupation;

public interface OccupationService {

	void createOccupation(Occupation occupation);

	public List<Occupation> getAllOccupation();

	

}
