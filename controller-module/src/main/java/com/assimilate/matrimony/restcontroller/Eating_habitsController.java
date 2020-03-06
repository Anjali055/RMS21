package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Eating_habits;
import com.assimilate.matrimony.service.Eating_habitsService;

@RestController
@RequestMapping("api/Eating_Habits")
public class Eating_habitsController {

	@Autowired
	Eating_habitsService eating_habitsService;
	
	
	@RequestMapping(path = "/createEating_habits")
	public Eating_habits createEating_habits(@RequestBody Eating_habits eating_habits)
	{
		eating_habitsService.createEating_habits(eating_habits);
		return eating_habits;
	}
	
	@RequestMapping("/getAllEating_habits")
	public List<Eating_habits>getAll(){
		List<Eating_habits>list=eating_habitsService.getAllEatingHabits();
		return list;
	}
}
