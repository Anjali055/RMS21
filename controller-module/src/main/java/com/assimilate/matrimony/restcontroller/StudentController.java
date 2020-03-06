package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.studentEntity;
import com.assimilate.matrimony.service.StudentImpl;


@RestController
@RequestMapping("api/student")
public class StudentController {
	@Autowired
	StudentImpl studentimpl;
	
	@RequestMapping(path="/getall")
	public List<studentEntity> getAll() {
		
		return studentimpl.getall();
		
	}
	
	
	@PostMapping(path="/save")
	public studentEntity saveMethod(@RequestBody studentEntity student){
	public student saveMethod(@RequestBody student student){
		System.out.println("controller"+student);
		
		return studentimpl.save(student) ;
		
	}

}
