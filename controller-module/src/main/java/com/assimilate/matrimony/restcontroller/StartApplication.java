package com.assimilate.matrimony.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.assimilate.matrimony.serviceImpl.Career_detailServiceImpl;
//import com.assimilate.matrimony.serviceImpl.Career_detailServiceImpl;
import com.assimilate.matrimony.serviceImpl.UserServiceImpl;

@SpringBootApplication(scanBasePackages = "com.assimilate.matrimony")
@EntityScan(basePackages = {"com.assimilate.matrimony.domain"})
@ComponentScan({"com.assimilate.matrimony.service"})
@ComponentScan(basePackageClasses = UserServiceImpl.class)
@ComponentScan(basePackageClasses = Career_detailServiceImpl.class)
@EnableJpaAuditing
@EnableJpaRepositories("com.assimilate.matrimony.dao")
@ComponentScan(basePackages = "com.spring")
@ComponentScan(basePackageClasses=UserRestController.class)
public class StartApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

}