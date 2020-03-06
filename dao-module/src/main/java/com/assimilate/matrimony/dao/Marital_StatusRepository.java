package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Marital_statusEntity;

@Repository
public interface Marital_StatusRepository extends JpaRepository<Marital_statusEntity, Integer>{

}
