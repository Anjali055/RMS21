package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.ManglikEntity;

@Repository
public interface ManglikRepository extends JpaRepository<ManglikEntity, Integer>{

}
