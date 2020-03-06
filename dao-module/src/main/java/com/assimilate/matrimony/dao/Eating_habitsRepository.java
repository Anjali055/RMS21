package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Eating_habits;

@Repository
public interface Eating_habitsRepository extends JpaRepository<Eating_habits, Integer>{

}
