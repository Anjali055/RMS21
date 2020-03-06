package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Body_type;

@Repository
public interface Body_typeRepository extends JpaRepository<Body_type, Integer>{

	
}
