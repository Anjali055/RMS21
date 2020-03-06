package com.assimilate.matrimony.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.CareerDetail;

@Repository
@Transactional
public interface career_detailRepositary extends JpaRepository<CareerDetail, Integer>{


	@Query("select u from CareerDetail u where u.user.user_id=:user_id")
	CareerDetail findByUserId(@Param("user_id") int user_id);

	@Modifying
	@Query("delete from CareerDetail u where u.user.user_id=:user_id")
	public void deleteByUserId(@Param("user_id")int user_id);








}
