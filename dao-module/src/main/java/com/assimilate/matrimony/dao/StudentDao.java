package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.student;



@Repository
public interface StudentDao extends JpaRepository<student, Integer> {
	
	

}
