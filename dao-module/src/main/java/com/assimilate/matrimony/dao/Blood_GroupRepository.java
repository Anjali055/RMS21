package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Blood_Group;
@Repository
public interface Blood_GroupRepository extends JpaRepository<Blood_Group, Integer>{

}