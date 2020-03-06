package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.ProfileDetails;


@Repository
public interface ProfileDetailsRepository  extends JpaRepository<ProfileDetails, Integer>{
	

}
