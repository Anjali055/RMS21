package com.assimilate.matrimony.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.FamilyDetailsDao;
import com.assimilate.matrimony.dao.UserDao;
import com.assimilate.matrimony.domain.FamilyDetails;
import com.assimilate.matrimony.domain.UserDetails;
import com.assimilate.matrimony.service.FamilyDetailsService;

@Service
public class FamilyDetailsServiceImpl implements FamilyDetailsService {
	
	@Autowired
	FamilyDetailsDao familydetailsdao;
	
	@Autowired
	UserServiceImpl userserviceimpl;
	
	@Autowired
	FamilyDetailsService familydetailsservice;
	
	@Autowired
	UserDao userodaobj;

	@Override
	public FamilyDetails postUser(FamilyDetails familyDetails) {
		
		
		//first to get the data based on id;
		//UserDetails userobj=userserviceimpl.getById(1);
		//familyDetails.setUser(userobj);
		
		return familydetailsdao.save(familyDetails);
	}

	@Override
	public List<FamilyDetails> getAllUser() {
		
		
		System.out.println();
		System.out.println();
		return familydetailsdao.findAll();
		
	}

	@Override
	public FamilyDetails getByUserId(int uid) {
		
		return familydetailsdao.findByUser_Id(uid);
	}

	@Override
	public FamilyDetails updateFamilyDetailsById(int uid, FamilyDetails familydetails) {
		familydetails.setFamily_id(uid);
		familydetailsdao.save(familydetails);
		return familydetails;
	}

	@Override
	public FamilyDetails updateFamilyDetailsByUserid(int user_id, FamilyDetails familydetails) {
		
	//now to get all the record based on the userid;
			
		FamilyDetails fm=familydetailsdao.findByUser_Id(user_id);
			System.out.println("---sssssssss-------"+fm);
			
			int familyid=fm.getFamily_id();
			System.out.println(" % %  %   %  %  %  %  %   % %  %  %  %  %  %  %  % "+familyid);
		 familydetails.setFamily_id(familyid);
		 
		UserDetails userobj=userodaobj.getOne(user_id);
		 familydetails.setUser(userobj);
		 
		return familydetailsdao.save(familydetails);
	}
//------------------------------------------------------------------------------------------------------------------------------
	/*@Override
	public int updateFamilyDetialsByUseridandFamilyid(FamilyDetails familydetails,int user_id, int family_id) {
			Optional<UserDetails> userobj=userodaobj.findById(user_id);
			//System.out.println(familydetailsservice.getByFamilyId(familydetails_id));
			//System.out.println("usssssssssssssssssssssssssssss"+userobj);
			if(userobj!=null) {
				Optional<FamilyDetails> familyobj=familydetailsdao.findById(family_id);
				System.out.println(".............."+familyobj);
				if(familyobj!=null) {
					familydetailsdao.save(familydetails);
					return familydetails.getFamily_id();
					
				}
			}
				
			else {
				System.out.println("not found");
			}
			
			FamilyDetails family=familydetailsdao.save(familydetails);
			
		return family.getFamily_id() ;
	}*/

	//----------------getbyfamilyid--------------------------
	@Override
	public Optional<FamilyDetails> getByFamilyId(int fid) {
		// TODO Auto-generated method stub
		return familydetailsdao.findById(fid) ;
	}

	@Override
	public int updateFamilyDetialsByUseridandFamilyid(FamilyDetails familydetalils, int user_id, int family_id) {
		UserDetails user=userodaobj.getOne(user_id);
		System.out.println("userdetails"+user);
		
		if(user!=null) {
			Optional<FamilyDetails> familyDetailsobj=familydetailsdao.findById(family_id);
			familydetalils.setUser(user);
			
			//to extrat the familyid from the optinal family details table
			
				if(familyDetailsobj!=null) {
					familydetalils.setFamily_id(family_id);
					
					familydetailsdao.save(familydetalils);
				}
				
			System.out.println("familydetails"+familydetalils);
		}
		else {
			System.out.println("data has not been inserted");
			
		}
		
		
		return 0;
	}

	

	
	
	}

	

	


