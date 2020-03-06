package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.ComplexionEntity;

@Repository
public interface ComplexionRepository extends JpaRepository<ComplexionEntity, Integer>{

}
