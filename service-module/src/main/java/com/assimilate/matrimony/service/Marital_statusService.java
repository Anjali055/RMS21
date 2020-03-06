package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Marital_statusEntity;

public interface Marital_statusService {

	void createmaritalstatuses(Marital_statusEntity marital_status);

	public List<Marital_statusEntity> getMaritalStatus();


}
