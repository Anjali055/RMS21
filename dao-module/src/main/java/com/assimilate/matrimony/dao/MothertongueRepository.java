package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import com.assimilate.matrimony.domain.Mothertongue;
@Repository
public interface MothertongueRepository extends JpaRepository<Mothertongue,Integer> {
=======
import com.assimilate.matrimony.domain.MothertongueEntity;

@Repository
public interface MothertongueRepository extends JpaRepository<MothertongueEntity, Integer> {
  
	
	 
>>>>>>> f981900817d7a49a6148140e8821500d94310551

}
