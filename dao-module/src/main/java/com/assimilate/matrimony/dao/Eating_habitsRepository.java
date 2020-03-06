package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Eating_habitsEntity;

@Repository
public interface Eating_habitsRepository extends JpaRepository<Eating_habitsEntity, Integer>{

}
