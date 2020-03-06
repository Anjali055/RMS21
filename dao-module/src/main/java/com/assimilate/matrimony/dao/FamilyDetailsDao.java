package com.assimilate.matrimony.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import com.assimilate.matrimony.domain.FamilyDetails;



public interface FamilyDetailsDao extends JpaRepository<FamilyDetails, Integer> {
	@Query("SELECT  u from FamilyDetails u where  u.user.user_id=:user_id")
	FamilyDetails findByUser_Id(@Param("user_id")int  user_id);

	
	
	

	
}
