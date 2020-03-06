package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Devak;

@Repository
public interface DevakRepository extends JpaRepository<Devak,Integer> {

}
