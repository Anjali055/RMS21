package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.ManglikEntity;

public interface ManglikService {

	void createManglik(ManglikEntity manglik);

	public List<ManglikEntity> getAllManglik();

}
