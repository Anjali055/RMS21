package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Marital;
@Repository
public interface MaritalRepository extends JpaRepository<Marital,Integer> {

}
