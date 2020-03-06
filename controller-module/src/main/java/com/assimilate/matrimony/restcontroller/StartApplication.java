package com.assimilate.matrimony.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.assimilate.matrimony.service.StudentImpl;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.assimilate.matrimony.serviceImpl.EducationDetailsServiceImpl;

//import com.assimilate.matrimony.dao.StudentDao;
//import com.assimilate.matrimony.service.StudentImpl;

@SpringBootApplication(scanBasePackages = "com.assimilate.matrimony")
@EntityScan(basePackages = {"com.assimilate.matrimony.domain"})
@ComponentScan({"com.assimilate.matrimony.serviceImpl"})
@EnableJpaAuditing
@ComponentScan(basePackageClasses = StudentImpl.class)


import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.assimilate.matrimony.serviceImpl.LanguageServiceImpl;
import com.assimilate.matrimony.serviceImpl.ProfileDetailsServiceImpl;


@Configuration 
@EnableWebMvc
@SpringBootApplication(scanBasePackages = "com.assimilate.matrimony")
@EntityScan(basePackages = {"com.assimilate.matrimony.domain"})


@ComponentScan({"com.assimilate.matrimony.service"})
@EnableJpaAuditing
@ComponentScan(basePackageClasses = ProfileDetailsServiceImpl.class)
@ComponentScan(basePackageClasses = LanguageServiceImpl.class)
@EnableJpaAuditing
@ComponentScan({"com.assimilate.matrimony.service"})
//@ComponentScan(basePackageClasses = StudentImpl.class)
@ComponentScan(basePackageClasses = EducationDetailsServiceImpl.class)
@EnableJpaRepositories("com.assimilate.matrimony.dao")
public class StartApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);

		System.out.println("matrimony application started...........");

	System.out.println("application start..........");
		System.out.println("hello");
		System.out.println("final");
		
	
	}

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