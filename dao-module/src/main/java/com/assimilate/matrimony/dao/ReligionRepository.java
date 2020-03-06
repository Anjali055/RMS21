package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import com.assimilate.matrimony.domain.Religion;
@Repository
public interface ReligionRepository extends JpaRepository<Religion,Integer> {
=======
import com.assimilate.matrimony.domain.ReligionEntity;

@Repository
public interface ReligionRepository extends JpaRepository<ReligionEntity, Integer> {
>>>>>>> f981900817d7a49a6148140e8821500d94310551

}
