package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.DesireformEntity;
import com.assimilate.matrimony.domain.Marital_statusEntity;
import com.assimilate.matrimony.domain.MothertongueEntity;
import com.assimilate.matrimony.domain.UserEntity;

public interface DesireformService {

	int createDesireforms(DesireformEntity desireform);

	public List<DesireformEntity> getAllDesireform();

	DesireformEntity getUserById(int user_id);

	void deleteRecordBasedOnUser_id(int user_id);

	DesireformEntity updateRecordsById(Integer user_id, int desire_form_id, DesireformEntity desireform);

	public List<Marital_statusEntity> getAllMarital_Status();

	public List<UserEntity> getAllUser();

	public List<MothertongueEntity> getAllMothertongue();

	//List<DesireformEntity> getAllMatching();


	




}
