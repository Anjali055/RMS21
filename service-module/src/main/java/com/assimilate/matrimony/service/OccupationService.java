package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.OccupationEntity;

public interface OccupationService {

	void createOccupation(OccupationEntity occupation);

	public List<OccupationEntity> getAllOccupation();

	

}
package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Occupation;

public interface OccupationService {

	public List<Occupation> getAllOccupation();

}
