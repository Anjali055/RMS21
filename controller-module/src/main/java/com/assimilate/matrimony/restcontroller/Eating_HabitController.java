package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Complexion;
import com.assimilate.matrimony.domain.Eating_Habits;
import com.assimilate.matrimony.service.ComplexionService;
import com.assimilate.matrimony.service.Eating_HabitService;

@RestController
@RequestMapping("api/eatinghabit")
public class Eating_HabitController {
	
private static final long serialVersionUID = 1L;
	
	
	@Autowired
	private Eating_HabitService eatinghabitservice;
	
	
	@GetMapping("/getAll")
	public List<Eating_Habits> getAll(){
		return eatinghabitservice.getEatingHabit();
	}

}
