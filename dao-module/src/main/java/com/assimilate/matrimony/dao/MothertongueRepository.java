package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.MothertongueEntity;

@Repository
public interface MothertongueRepository extends JpaRepository<MothertongueEntity, Integer> {
  
	
	 

}