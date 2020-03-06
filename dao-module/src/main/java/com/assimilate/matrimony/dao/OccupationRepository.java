package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.OccupationEntity;

@Repository
public interface OccupationRepository extends JpaRepository<OccupationEntity, Integer>{

}
