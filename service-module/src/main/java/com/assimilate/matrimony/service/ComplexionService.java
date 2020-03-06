package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Complexion;
import com.assimilate.matrimony.domain.User;

public interface ComplexionService {

	public List<Complexion> getComplexion();

}
package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.ComplexionEntity;

public interface ComplexionService {

	void createComplexion(ComplexionEntity complexion);

	List<ComplexionEntity> getAllComplexion();

}
