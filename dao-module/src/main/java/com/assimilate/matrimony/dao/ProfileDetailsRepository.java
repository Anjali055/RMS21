package com.assimilate.matrimony.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.ProfileDetailsEntity;

@Repository
@Transactional
public interface ProfileDetailsRepository extends JpaRepository<ProfileDetailsEntity, Integer> {
	@Modifying
	@Query("delete from ProfileDetailsEntity p where p.user.user_id=:user_id")
	int deleteByUserId(@Param("user_id") int user_id);


	

	@Query("select p from ProfileDetailsEntity p where p.user.user_id=:user_id")
	ProfileDetailsEntity findByUserId(@Param("user_id") int user_id);

	
	
	
	
}
