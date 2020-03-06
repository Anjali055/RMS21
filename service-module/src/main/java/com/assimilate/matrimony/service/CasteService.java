package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.CasteEntity;

public interface CasteService {

	void createcaste(CasteEntity caste);

	public List<CasteEntity> getAllCaste();

}
