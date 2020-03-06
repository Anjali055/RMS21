package com.assimilate.matrimony.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.assimilate.matrimony.dao.Blood_GroupRepository;
import com.assimilate.matrimony.dao.Body_TypeRepository;
import com.assimilate.matrimony.dao.ComplexionRepository;
import com.assimilate.matrimony.dao.Eating_HabitRepository;
import com.assimilate.matrimony.dao.Personal_DetailsRepository;
import com.assimilate.matrimony.dao.UserRepository;
import com.assimilate.matrimony.domain.Personal_Details;
import com.assimilate.matrimony.domain.User;
import com.assimilate.matrimony.service.Personal_DetailsService;

@Service
public class Personal_DetailsServiceImpl implements Personal_DetailsService{
	@Autowired
	private Personal_DetailsRepository personalDetailRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private Blood_GroupRepository bloodGroupRepository;
	@Autowired
	private Body_TypeRepository bodyTypeRepository;
	@Autowired
	private ComplexionRepository complexionRepository;
	@Autowired
	private Eating_HabitRepository eatingHabitRepository;


	
	@Override
	public int createPersonalDetails(Personal_Details personalDetail) {
		Personal_Details pDetail = personalDetailRepository.save(personalDetail);
		return pDetail.getPersonaldetails_id();
		
	}
	
	
	@Override
	public List<Personal_Details> getAllPersonalDetails() {
		return personalDetailRepository.findAll();
	}
	
	
	

	@Override
	public Personal_Details getPersonalDetailByUserId(int user_id) {
		return personalDetailRepository.getByUserId(user_id);
	}
	
	
	
	
	/*@Override
	public int deletePersonalDetailsById(int user_id) {
		personalDetailRepository.deleteByUserId(user_id);
		return 1;
		
	}*/



	@Override
	public Personal_Details updatePersonalDetails(Personal_Details personalDetail, int user_id,
			int personaldetails_id) {
		User user=userRepository.getOne(user_id);
		System.out.println("User...."+user);
		if(user!=null)
		{
			Optional<Personal_Details> personalDetails1=personalDetailRepository.findById(personaldetails_id);
			personalDetail.setUser(user);
			
			if(personalDetails1!=null) {
				personalDetail.setPersonaldetails_id(personaldetails_id);
				personalDetailRepository.save(personalDetail);
			}
			System.out.println("personal details"+personalDetail);
		}
		else {
			System.out.println("Not inserted record");
		}
		return personalDetail;
		
	}



	


	@Override
	public int deleteById(int user_id) {
		User user= userRepository.getOne(user_id);
		if(user != null) {
			int VarIsDeletedObj= user.getIsDelete();
			
			if(user.getIsDelete()==0) {
				user.setIsDelete(1);
				userRepository.save(user);
			}
		else {
			user.setIsDelete(1);
			userRepository.save(user);
		}

	}
    return user_id;
}
}