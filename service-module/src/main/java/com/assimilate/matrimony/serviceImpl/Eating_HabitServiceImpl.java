package com.assimilate.matrimony.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.Eating_HabitRepository;
import com.assimilate.matrimony.domain.Eating_Habits;
import com.assimilate.matrimony.service.Eating_HabitService;

@Service
public class Eating_HabitServiceImpl implements Eating_HabitService{
	@Autowired
	private Eating_HabitRepository eatinghabitrepository;

	@Override
	public List<Eating_Habits> getEatingHabit() {
		// TODO Auto-generated method stub
		return eatinghabitrepository.findAll();
	}
	

}
