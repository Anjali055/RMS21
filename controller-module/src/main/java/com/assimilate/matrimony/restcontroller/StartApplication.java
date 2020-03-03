package com.assimilate.matrimony.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
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
@EnableJpaRepositories("com.assimilate.matrimony.dao")
public class StartApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

}