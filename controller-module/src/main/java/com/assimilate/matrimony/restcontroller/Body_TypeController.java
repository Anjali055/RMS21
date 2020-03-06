package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Body_Type;
import com.assimilate.matrimony.domain.Complexion;
import com.assimilate.matrimony.service.Body_TypeService;

@RestController
@RequestMapping("api/bodytype")
public class Body_TypeController {
	
	@Autowired
	private Body_TypeService body_typeservice;
	
	@GetMapping("/getAll")
	public List<Body_Type> getAll(){
		return body_typeservice.getBodyType();
	}

}
