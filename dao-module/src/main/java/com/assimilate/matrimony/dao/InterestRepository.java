package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.InterestEntity;
@Repository
public interface InterestRepository extends JpaRepository<InterestEntity, Integer> {
	
	

}
