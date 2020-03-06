package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.MothertongueEntity;

public interface MothertongueService {

	void createMothertongue(MothertongueEntity mothertongue);

	public List<MothertongueEntity> geAllMothertongue();

import com.assimilate.matrimony.domain.Mothertongue;

public interface MothertongueService {

	public List<Mothertongue> getAllMothertongue();

}
