package com.assimilate.matrimony.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.User;

@Repository
@Transactional
public interface UserRepositary extends JpaRepository<User,Integer>{

	List<User> findAllByisDelete(int i);

//	@Modifying
//	@Query("select count(*)from User where isdelete!=1")
//	int findAllByCount();

	List<User> findAllByGender(String string);



	List<User> findByIsDeleteAndGender(int i, String string);

	long countByIsDelete(int i);

	
//	@Query("select count(*) from user u where u.user.isdelete!=1")
//	public long countUser(@Param("user")user);


	//@Query("select count(*) from User u where u.user.isdelete!=1")


}
