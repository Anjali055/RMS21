package com.assimilate.matrimony.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.UserDetails;

@Repository
public interface UserDao extends JpaRepository<UserDetails, Integer> {

	List<UserDetails> findAllByisDelete(int i);

	List<UserDetails> findAllByGender(String string);

	List<UserDetails> findByisDeleteAndGender(int isDelete,String gender);



	int countByisDelete(int i);
	

}
