package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.CasteEntity;

@Repository
public interface CasteRepository extends JpaRepository<CasteEntity, Integer> {

}
