package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.CareerDetail;

public interface Career_detaiService {

	public  CareerDetail createCarrier(CareerDetail careerDetail);

	public List<CareerDetail> getAllDetails();

	public CareerDetail getUserBy_Id(int user_id);

	public void deleteRecordBasedOnUser_id(int user_id);

	public CareerDetail updateRecordsById(Integer user_id, int careerdetail_id, CareerDetail careerDetail);

	




	
}
