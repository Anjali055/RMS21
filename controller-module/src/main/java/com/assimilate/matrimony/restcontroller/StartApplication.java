package com.assimilate.matrimony.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.assimilate.matrimony.serviceImpl.Blood_GroupServiceImpl;
import com.assimilate.matrimony.serviceImpl.ComplexionServiceImpl;
import com.assimilate.matrimony.serviceImpl.UserServiceImpl;

@SpringBootApplication(scanBasePackages = "com.assimilate.matrimony")
@EntityScan(basePackages = {"com.assimilate.matrimony.domain"})
@ComponentScan({"com.assimilate.matrimony.service"})

@ComponentScan(basePackageClasses = UserServiceImpl.class)
@ComponentScan(basePackageClasses = ComplexionServiceImpl.class)
@ComponentScan(basePackageClasses = Blood_GroupServiceImpl.class)

@EnableJpaRepositories("com.assimilate.matrimony.dao")
public class StartApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

}