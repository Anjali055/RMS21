package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.Eating_habitsRepository;
import com.assimilate.matrimony.domain.Eating_habits;
import com.assimilate.matrimony.service.Eating_habitsService;

@Service
public class Eating_habitsServiceImpl implements Eating_habitsService{

	@Autowired
	private Eating_habitsRepository eating_habitsRepository;

	@Override
	public void createEating_habits(Eating_habits eating_habits) {
		
		
		eating_habitsRepository.save(eating_habits);
		System.out.println("service method called.......");
	}

	@Override
	public List<Eating_habits> getAllEatingHabits() {
		List<Eating_habits>list=eating_habitsRepository.findAll();
		return list;
	}
	
}
