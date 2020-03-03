package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.LifeStyleEntity;

@Repository
public interface LifeStyleRepository extends JpaRepository<LifeStyleEntity, Integer>{

}
