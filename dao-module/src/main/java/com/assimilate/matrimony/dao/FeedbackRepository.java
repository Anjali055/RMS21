package com.assimilate.matrimony.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Feedback;
@Repository
//@Transactional
public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{	
	@Modifying
	@Query("delete from Feedback f where f.user.user_id=:user_id")
	int deleteByUser_id(@Param("user_id") int user_id);

	
	
	@Query("select u from Feedback u where u.user.user_id=:user_id")
	Feedback getByUserId(@Param("user_id") int user_id);



	

	
	
	
	
	
	
}
