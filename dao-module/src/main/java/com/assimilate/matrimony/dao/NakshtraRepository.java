package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Nakshtra;

@Repository
public interface NakshtraRepository extends JpaRepository<Nakshtra,Integer> {

}
