package com.assimilate.matrimony.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.DesireformRepository;
import com.assimilate.matrimony.dao.Marital_StatusRepository;
import com.assimilate.matrimony.dao.MothertongueRepository;
import com.assimilate.matrimony.dao.UserRepository;
import com.assimilate.matrimony.domain.DesireformEntity;
import com.assimilate.matrimony.domain.Marital_statusEntity;
import com.assimilate.matrimony.domain.MothertongueEntity;
import com.assimilate.matrimony.domain.UserEntity;
import com.assimilate.matrimony.service.DesireformService;

@Service
public class DesireformServiceImpl implements DesireformService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private DesireformRepository desireformRepository;
	
	@Autowired
	private Marital_StatusRepository marital_statusRepository;
	
	@Autowired
	private MothertongueRepository mothertongueRepository;
	
	
	
	
	
	@Override
	public int createDesireforms(DesireformEntity desireform) {
		DesireformEntity detailFromDb = desireformRepository.save(desireform);
		return detailFromDb.getDesire_form_id();
	}

	@Override
	public List<DesireformEntity> getAllDesireform() {
		List<DesireformEntity>list=desireformRepository.findAll();
		return list;
	}

	@Override
	public DesireformEntity getUserById(int user_id) {
		
		return desireformRepository.getOne(user_id);
	}

	@Override
	public void deleteRecordBasedOnUser_id(int user_id) {
		// TODO Auto-generated method stub
		 desireformRepository.deleteById(user_id);
	}

	@Override
	public DesireformEntity updateRecordsById(Integer user_id, int desire_form_id, DesireformEntity desireform) {
		UserEntity user = userRepository.getOne(user_id);
		System.out.println("userdetails"+user_id);
		if(user!=null)
		{
			Optional<DesireformEntity>desireformObj = desireformRepository.findById(desire_form_id);
			desireform.setUser(user);
			if(desireformObj !=null) {
				desireform.setDesire_form_id(desire_form_id);
				desireformRepository.save(desireform);
			}
			System.out.println(desireform);
		}
		else {
			System.out.println("data not inserted");
		}
		return desireform;
	}

	@Override
	public List<Marital_statusEntity> getAllMarital_Status() {
		List<Marital_statusEntity>list=marital_statusRepository.findAll();
		return list;
	}

	@Override
	public List<UserEntity> getAllUser() {
		List<UserEntity>list=userRepository.findAll();
		return list;
	}

	@Override
	public List<MothertongueEntity> getAllMothertongue() {
	List<MothertongueEntity>list=mothertongueRepository.findAll();
		return list;
	}

	/*
	 * @Override public List<DesireformEntity> getAllMatching() {
	 * 
	 * List<DesireformEntity> res = desireformRepository.getAllMatching(); return
	 * res; }
	 */
}

