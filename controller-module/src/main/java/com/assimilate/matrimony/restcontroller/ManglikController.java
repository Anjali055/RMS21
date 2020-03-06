package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.ManglikEntity;
import com.assimilate.matrimony.service.ManglikService;

@RestController
@RequestMapping("api/Manglik")

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Manglik;
import com.assimilate.matrimony.service.ManglikService;

@RestController

public class ManglikController {

	@Autowired
	ManglikService manglikService;

	@RequestMapping(path = "/createManglik")
	public ManglikEntity createManglik(@RequestBody ManglikEntity manglik) {
		manglikService.createManglik(manglik);
		return manglik;
	}
	
	@RequestMapping("/getAllManglik")
	public List<ManglikEntity>getAllManglik(){
		List<ManglikEntity>list=manglikService.getAllManglik();
		return list;
	}

	@GetMapping("/api/user/getAllManglik")
	public List<Manglik> getAllManglik()
	{
		List<Manglik> user=manglikService.getAllManglik();
		return user;
	}
	

}
