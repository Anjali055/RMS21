package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
import com.assimilate.matrimony.domain.Manglik;

@Repository
public interface ManglikRepository extends JpaRepository<Manglik,Integer> {

	
=======
import com.assimilate.matrimony.domain.ManglikEntity;

@Repository
public interface ManglikRepository extends JpaRepository<ManglikEntity, Integer>{
>>>>>>> f981900817d7a49a6148140e8821500d94310551

}
