package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Complexion;

@Repository
public interface ComplexionRepository extends JpaRepository<Complexion, Integer>{

}
