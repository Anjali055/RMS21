package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Body_Type;

@Repository
public interface Body_TypeRepository extends JpaRepository<Body_Type, Integer>{

}
