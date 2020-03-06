package com.assimilate.matrimony.dao;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.EducationDetailsEntity;

@Repository
@Transactional
public interface EducationDetailsRepository extends JpaRepository<EducationDetailsEntity, Integer> {
	
	//@Query("select e from EducationDetailsEntity e where e.user.user_id=:user_id")
	//public EducationDetailsEntity findById(@Param("user_id") int user_id);
	@Modifying
	@Query("delete from EducationDetailsEntity  e where e.user.user_id=:user_id")
	int deleteByUserId(@Param("user_id") int user_id);

	@Query("select e from EducationDetailsEntity e where e.user.user_id=:user_id")
	EducationDetailsEntity findByUserId(@Param("user_id")int user_id);
	

	
	
	

	//EducationDetailsEntity findByeducation_details_id(int education_details_id);
	

}
