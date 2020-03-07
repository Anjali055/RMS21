package com.assimilate.matrimony.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.BacholerDegreeRepository;
import com.assimilate.matrimony.dao.EducationDetailsRepository;
import com.assimilate.matrimony.dao.UserRepository;
import com.assimilate.matrimony.domain.EducationDetailsEntity;
import com.assimilate.matrimony.domain.UserEntity;
import com.assimilate.matrimony.service.EducationDetailsService;
import com.assimilate.rishta.model.EducationDetails;

@Service
public class EducationDetailsServiceImpl implements  EducationDetailsService{
	@Autowired
	private EducationDetailsRepository educationDetailsRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BacholerDegreeRepository bacholerDegreeRepository;
	
	//@Override
	//public int updateEducationDetails(EducationDetailsEntity educationDetails) {
		//EducationDetailsEntity detailsFromDb= educationDetailsRepository.save(educationDetails);
		//return detailsFromDb.getEducation_details_id();
		
	//}

	
	//--------------------------------------------------------------------------------------------------------------------
	
	@Override
	public int createEducationDetails(EducationDetailsEntity educationDetails) {
		EducationDetailsEntity detailsFromDb= educationDetailsRepository.save(educationDetails);
		return detailsFromDb.getEducation_details_id();
	}

	//-----------------------------------------------------------------------------------------------------------------------

	@Override
	public List<EducationDetailsEntity> getEducationDetails() {
		return educationDetailsRepository.findAll();
		
	}
	public List<UserEntity> getUserEntity(){
		return  userRepository.findAll();
	}
	
	//--------------------------------------------------------------------------------------------------------------------------

	@Override
	public int deleteById(int user_id) {
		UserEntity userEntity= userRepository.getOne(user_id);
		if( userEntity !=null) {
			int VarIsDeletedObj=userEntity.getIsDelete();
			
			if(userEntity.getIsDelete()==0) {
				
				userEntity.setIsDelete(1);
			    userRepository.save(userEntity);
			}
		
			
		  else {
				userEntity.setIsDelete(1);
				userRepository.save(userEntity);
		  }
		  }
		return user_id;
		}

		
		
			//}


     @Override
	public EducationDetailsEntity getUserById(int user_id) {
		return educationDetailsRepository.findByUserId(user_id);

	}
	
 //----------------------------------------------------------------------------------------------------------------
//	
//    @Override
//	public EducationDetailsEntity getUserById(int user_id) {
//	EducationDetailsEntity educationDetails=educationDetailsRepository.findById(user_id);
//	return  educationDetails;
//	}

//--------------------------------------------------------------------------------------------------------------------------------

	@Override
	public EducationDetailsEntity updateEducationDetailsById(EducationDetailsEntity educationDetails, int user_id,int education_details_id) {
		 UserEntity user=userRepository.getOne(user_id);
		 System.out.println("userEntity"+user);
		//Optional<UserEntity> user=userRepository.findById(user_id);
		if(user!=null) {
			Optional<EducationDetailsEntity> educationDetailsEntity=educationDetailsRepository.findById(education_details_id);
			
			//EducationDetailsEntity educationDetailsEntity=educationDetailsRepository.findByUserId(education_details_id);
			educationDetails.setUser(user);
			
			if(educationDetailsEntity!=null) {
				educationDetails.setEducation_details_id(education_details_id);
				educationDetailsRepository.save(educationDetails);
				// educationDetails.setEducation_details_id(education_details_id);
			}
			System.out.println("educationdetails"+educationDetails);
		}
		
		else {
			System.out.println("dosenot inserted record");
		} 
		
		return educationDetails;
}

	
	

	
		//return userRepository.findAll();
	

	//@Override
	//public String getUserBrideCount(String gender) {
	//	List<UserEntity> user=userRepository.findAll();
	//	return "count of bride";
		
	//}

	
}
	
	

	


