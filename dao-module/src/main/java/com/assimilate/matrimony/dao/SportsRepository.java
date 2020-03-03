package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.SportsEntity;
@Repository
public interface SportsRepository extends JpaRepository<SportsEntity, Integer>{

}
