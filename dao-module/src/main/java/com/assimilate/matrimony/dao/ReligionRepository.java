package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.ReligionEntity;

@Repository
public interface ReligionRepository extends JpaRepository<ReligionEntity, Integer> {

}
