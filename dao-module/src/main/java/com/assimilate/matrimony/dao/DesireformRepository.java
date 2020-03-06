package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Desireform;

@Repository
public interface DesireformRepository extends JpaRepository<Desireform, Integer>{

	
	
	/*
	 * @Query("select u from Desireform u where u.user.user_id=:user_id") Desireform
	 * finfByUserId(@Param("user_id") int user_id);
	 * 
	 * @Modifying
	 * 
	 * @Query("delete from Desireform d where u.user.user_id=:user_id") public void
	 * deleteByUserId(@Param("user_id") int user_id);
	 * 
	 */	 
}
