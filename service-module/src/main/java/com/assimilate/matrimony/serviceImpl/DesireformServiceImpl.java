package com.assimilate.matrimony.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.DesireformRepository;
import com.assimilate.matrimony.dao.Marital_StatusRepository;
import com.assimilate.matrimony.dao.MothertongueRepository;
import com.assimilate.matrimony.dao.UserRepository;
import com.assimilate.matrimony.domain.Desireform;
import com.assimilate.matrimony.domain.Marital_status;
import com.assimilate.matrimony.domain.Mothertongue;
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
	public int createDesireforms(Desireform desireform) {
		Desireform detailFromDb = desireformRepository.save(desireform);
		return detailFromDb.getDesire_form_id();
	}

	@Override
	public List<Desireform> getAllDesireform() {
		List<Desireform>list=desireformRepository.findAll();
		return list;
	}

	@Override
	public Desireform getUserById(int user_id) {
		
		return desireformRepository.getOne(user_id);
	}

	@Override
	public void deleteRecordBasedOnUser_id(int user_id) {
		// TODO Auto-generated method stub
		 desireformRepository.deleteById(user_id);
	}

	@Override
	public Desireform updateRecordsById(Integer user_id, int desire_form_id, Desireform desireform) {
		UserEntity user = userRepository.getOne(user_id);
		System.out.println("userdetails"+user_id);
		if(user!=null)
		{
			Optional<Desireform>desireformObj = desireformRepository.findById(desire_form_id);
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
	public List<Marital_status> getAllMarital_Status() {
		List<Marital_status>list=marital_statusRepository.findAll();
		return list;
	}

	@Override
	public List<UserEntity> getAllUser() {
		List<UserEntity>list=userRepository.findAll();
		return list;
	}

	@Override
	public List<Mothertongue> getAllMothertongue() {
	List<Mothertongue>list=mothertongueRepository.findAll();
		return list;
	}

}

