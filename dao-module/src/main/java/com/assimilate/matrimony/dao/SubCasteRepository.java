package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.SubCasteEntity;

@Repository
public interface SubCasteRepository extends JpaRepository<SubCasteEntity, Integer>{

}