package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Gotra;

@Repository
public interface GotraRepository extends JpaRepository<Gotra,Integer> {

}
