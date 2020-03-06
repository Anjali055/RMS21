package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Blood_group;

@Repository
public interface Blood_groupRepository extends JpaRepository<Blood_group, Integer>{

}
