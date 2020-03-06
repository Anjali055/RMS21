package com.assimilate.matrimony.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.City;
import com.assimilate.matrimony.domain.Country;

@Repository
public interface CityDao extends JpaRepository<City, Integer> {
	
}
