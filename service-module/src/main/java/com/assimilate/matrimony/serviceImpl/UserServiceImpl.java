package com.assimilate.matrimony.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.UserDao;
import com.assimilate.matrimony.domain.UserDetails;
import com.assimilate.matrimony.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userdao;
	

	@Override
	public List<UserDetails> getAllUser() {
		
		return  userdao.findAllByisDelete(0);
			
		
	}

	@Override
	public String postUser(UserDetails userdetails) {
		String result = "record inserted succesfullly";

		UserDetails listuserdetails = userdao.save(userdetails);
		if (listuserdetails == null) {
			result = "insertion failed";

		}
		return result;

	}
	
	

	@Override
	public UserDetails getById(int userid) {
		
		UserDetails varUserObj=null;
		
		UserDetails userInfo= userdao.getOne(userid);
		if(userInfo!=null) {
			if(userInfo.getIsDelete()==0) {
				varUserObj=userInfo;
				return varUserObj;
				
			}
			else {
				System.out.println("record deleted succesfully,Register again");
				
			}
		}
		return  varUserObj ;
		
		
	
		
		
	}
	
	
	
	

	// -------------soft delete----------------//

	@Override
	public int deleteByid(int userid) {
		UserDetails userDetails = userdao.getOne(userid);
		if (userDetails != null) {
			int varIsDeletedObject = userDetails.getIsDelete();

			if (userDetails.getIsDelete() == 0) {
				userDetails.setIsDelete(1);
				userdao.save(userDetails);
			}

			else {
				userDetails.setIsDelete(0);
				userdao.save(userDetails);
			}

		}

		return userDetails.getIsDelete();
	}
	
	
	//--------------to get all the grooms--------------//

	@Override
	public List<UserDetails> getAllGroom() {
		List<UserDetails> ListBasedOnGender=null;
		
		List<UserDetails> allUserDetailsObj=userdao.findAll();
		
			
		if(allUserDetailsObj!=null) {
			
			
				ListBasedOnGender =userdao.findByisDeleteAndGender(0, "male");
				
			
			}
		
		
		
		for(UserDetails u:allUserDetailsObj) {
			//System.out.println("all the list"+u);
			
			
			
			
		}
		return ListBasedOnGender  ;
	}

	
	//-------get all usercount ----//
	@Override
		public int getAllUserCount() {
		
		List<UserDetails> userobj=userdao.findAll();
		int count=0;
		
		for(UserDetails u:userobj) {
			if((u.getIsDelete()==0)){
				count++;
			}
			
		}
		System.out.println("count"+count);
		
	
			return userdao.countByisDelete(0);
		}
	

}
