package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.student;
import com.assimilate.matrimony.service.StudentImpl;


@RestController
@RequestMapping("api/student")
public class StudentController {
	@Autowired
	StudentImpl studentimpl;
	
	@RequestMapping(path="/getall")
	public List<student> getAll() {
		
		return studentimpl.getall();
		
	}
	
	
	@PostMapping(path="/save")
	public student saveMethod(@RequestBody student student){
		
		return studentimpl.save(student) ;
		
	}

}
///
////
////
///