package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.HobbiesEntity;
@Repository
public interface HobbiesRepository extends JpaRepository<HobbiesEntity, Integer> {

}
