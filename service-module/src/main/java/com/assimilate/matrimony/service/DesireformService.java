package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Desireform;
import com.assimilate.matrimony.domain.Marital_status;
import com.assimilate.matrimony.domain.Mothertongue;
import com.assimilate.matrimony.domain.UserEntity;

public interface DesireformService {

	int createDesireforms(Desireform desireform);

	public List<Desireform> getAllDesireform();

	Desireform getUserById(int user_id);

	void deleteRecordBasedOnUser_id(int user_id);

	Desireform updateRecordsById(Integer user_id, int desire_form_id, Desireform desireform);

	public List<Marital_status> getAllMarital_Status();

	public List<UserEntity> getAllUser();

	public List<Mothertongue> getAllMothertongue();


	




}
