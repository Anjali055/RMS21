package com.assimilate.matrimony.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

	

	
}
