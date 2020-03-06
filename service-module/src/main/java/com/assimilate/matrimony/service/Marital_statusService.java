package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Marital_status;

public interface Marital_statusService {

	void createmaritalstatuses(Marital_status marital_status);

	public List<Marital_status> getMaritalStatus();


}
