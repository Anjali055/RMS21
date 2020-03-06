package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Personal_Details;

@Repository
public interface Personal_DetailsRepository extends JpaRepository<Personal_Details, Integer>{
	@Query("select u from Personal_Details u where u.user.user_id=:user_id")
	Personal_Details getByUserId(int user_id);

	
	@Modifying
	@Query("delete from Personal_Details p where p.user.user_id=:user_id")
	void deleteByUserId(int user_id);
}
