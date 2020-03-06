package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.assimilate.matrimony.domain.FamilyDetails;
import com.assimilate.matrimony.domain.UserDetails;
import com.assimilate.matrimony.service.UserService;
import com.assimilate.matrimony.serviceImpl.CountryServiceImpl;

import com.assimilate.matrimony.serviceImpl.StateServiceImpl;
import com.assimilate.matrimony.serviceImpl.StudentImpl;
import com.assimilate.matrimony.serviceImpl.UserServiceImpl;



@SpringBootApplication(scanBasePackages = "com.assimilate.matrimony")
@EntityScan(basePackages = {"com.assimilate.matrimony.domain"})
@EnableJpaAuditing
//@ComponentScan({"com.assimilate.matrimony.service"})

//@ComponentScan(basePackageClasses = StudentImpl.class)
//@ComponentScan(basePackageClasses =CountryServiceImpl.class)
//@ComponentScan(basePackageClasses = FamilyDetailsServiceImpl.class)

@EnableJpaRepositories("com.assimilate.matrimony.dao")
public class StartApplication  {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
		System.out.println("hello");
		System.out.println("finalllllllllll");
		
	}


		
		
		
	

	

}