package com.assimilate.matrimony.service;

import java.util.List;

import com.assimilate.matrimony.domain.Eating_habitsEntity;

public interface Eating_habitsService {

	void createEating_habits(Eating_habitsEntity eating_habits);

	public List<Eating_habitsEntity> getAllEatingHabits();

	

}
