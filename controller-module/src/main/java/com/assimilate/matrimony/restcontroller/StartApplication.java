package com.assimilate.matrimony.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.assimilate.matrimony.serviceImpl.EducationDetailsServiceImpl;

//import com.assimilate.matrimony.dao.StudentDao;
//import com.assimilate.matrimony.service.StudentImpl;



@SpringBootApplication(scanBasePackages = "com.assimilate.matrimony")
@EntityScan(basePackages = {"com.assimilate.matrimony.domain"})
@EnableJpaAuditing
@ComponentScan({"com.assimilate.matrimony.service"})
//@ComponentScan(basePackageClasses = StudentImpl.class)
@ComponentScan(basePackageClasses = EducationDetailsServiceImpl.class)
@EnableJpaRepositories("com.assimilate.matrimony.dao")
public class StartApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
		System.out.println("hello");
		System.out.println("final");
		
	
	}

}