package com.assimilate.matrimony.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.StudentDao;
import com.assimilate.matrimony.domain.student;



@Service
public class StudentImpl {
	@Autowired
	StudentDao studentdao;

	public List<student> getall() {
		// TODO Auto-generated method stub
		List<student> stu= studentdao.findAll();
		System.out.println("dddddddd");
		return stu;
	}

	public student save(student student) {
		// TODO Auto-generated method stub
		return studentdao.save(student);
	}

	
	

}
