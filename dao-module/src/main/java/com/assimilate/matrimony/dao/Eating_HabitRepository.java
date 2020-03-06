package com.assimilate.matrimony.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assimilate.matrimony.domain.Eating_Habits;
@Repository
public interface Eating_HabitRepository extends JpaRepository<Eating_Habits, Integer>{

}
