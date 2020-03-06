package com.assimilate.matrimony.restcontroller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
<<<<<<< HEAD
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.assimilate.matrimony.service.StudentImpl;

@SpringBootApplication(scanBasePackages = "com.assimilate.matrimony")
@EntityScan(basePackages = {"com.assimilate.matrimony.domain"})
@ComponentScan({"com.assimilate.matrimony.serviceImpl"})
@EnableJpaAuditing
@ComponentScan(basePackageClasses = StudentImpl.class)


=======
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
>>>>>>> f981900817d7a49a6148140e8821500d94310551
@EnableJpaRepositories("com.assimilate.matrimony.dao")
public class StartApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	System.out.println("application start..........");
	}

}