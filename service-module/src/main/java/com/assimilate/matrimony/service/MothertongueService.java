package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.MothertongueEntity;

public interface MothertongueService {

	void createMothertongue(MothertongueEntity mothertongue);

	public List<MothertongueEntity> geAllMothertongue();


}
