package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.DressStyleEntity;

@Repository
public interface DressStyleRepository extends JpaRepository<DressStyleEntity, Integer>{

}
