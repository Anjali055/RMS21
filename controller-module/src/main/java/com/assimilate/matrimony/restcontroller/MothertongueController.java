package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Mothertongue;
import com.assimilate.matrimony.service.MothertongueService;

@RestController
@RequestMapping("api/Mothertongue")
public class MothertongueController {

	
	@Autowired
	MothertongueService mothertongueService;
	
	@RequestMapping(path = "/createMothertongue")
	public Mothertongue createMothertongue(@RequestBody Mothertongue mothertongue) {
		
		mothertongueService.createMothertongue(mothertongue);
		return mothertongue;
		
	}
	@RequestMapping("/getAllMothertongue")
	public List<Mothertongue>getAll(){
		List<Mothertongue>list=mothertongueService.geAllMothertongue();
		return list;
	}
}
