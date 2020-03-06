package com.assimilate.matrimony.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assimilate.matrimony.dao.StudentDao;
import com.assimilate.matrimony.domain.studentEntity;



@Service
public class StudentImpl {
	@Autowired
	StudentDao studentdao;

	public List<studentEntity> getall() {
		// TODO Auto-generated method stub
		List<studentEntity> stu= studentdao.findAll();
		System.out.println("dddddddd");
		return stu;
	}

	public studentEntity save(studentEntity student) {
		// TODO Auto-generated method stub
		return studentdao.save(student);
	}

	
	

}
