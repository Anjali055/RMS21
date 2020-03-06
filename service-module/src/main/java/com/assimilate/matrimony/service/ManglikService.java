package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Manglik;

public interface ManglikService {

	void createManglik(Manglik manglik);

	public List<Manglik> getAllManglik();

}
