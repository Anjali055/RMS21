package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.MothertongueEntity;
import com.assimilate.matrimony.service.MothertongueService;

@RestController
@RequestMapping("api/Mothertongue")
public class MothertongueController {

	
	@Autowired
	MothertongueService mothertongueService;
	
	@RequestMapping(path = "/createMothertongue")
	public MothertongueEntity createMothertongue(@RequestBody MothertongueEntity mothertongue) {
		
		mothertongueService.createMothertongue(mothertongue);
		return mothertongue;
		
	}
	@RequestMapping("/getAllMothertongue")
	public List<MothertongueEntity>getAll(){
		List<MothertongueEntity>list=mothertongueService.geAllMothertongue();
		return list;
	}

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Mothertongue;
import com.assimilate.matrimony.service.MothertongueService;

@RestController
public class MothertongueController {
	
	
	@Autowired
	
	MothertongueService mothertongueService;
	
	@GetMapping("/api/user/getAllMothertongue")
	public List<Mothertongue> getAllMothertongue()
	{
		List<Mothertongue> user=mothertongueService.getAllMothertongue();
		return user;
		
	}
	

}
