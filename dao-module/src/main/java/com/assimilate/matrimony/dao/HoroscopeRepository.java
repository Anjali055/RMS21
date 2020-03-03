package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.HoroscopeEntity;

@Repository
public interface HoroscopeRepository extends JpaRepository<HoroscopeEntity, Integer> {

}
