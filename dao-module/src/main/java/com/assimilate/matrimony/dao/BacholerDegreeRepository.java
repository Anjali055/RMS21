package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.BacholerDegreeEntity;

@Repository
public interface BacholerDegreeRepository extends JpaRepository<BacholerDegreeEntity, Integer>{

}
