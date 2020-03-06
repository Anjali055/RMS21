package com.assimilate.matrimony.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Country;
import com.assimilate.matrimony.domain.State;

@Repository
public interface StateDao extends JpaRepository<State,Integer> {

	

	

	//List<State> findByCountry(int cid);

	//List<State> findByCountry(Country country);
	
	//public List<State> findByCountryid(int cid);

}
