package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Body_type;
import com.assimilate.matrimony.service.Body_typeService;

@RestController
@RequestMapping("api/Body_Type")
public class Body_typeController {

	@Autowired
	Body_typeService body_typeService;
	
	@RequestMapping(path = "/createBody_type")
	public Body_type createbody_type(@RequestBody Body_type body_type) {
		body_typeService.createBody_type(body_type);
		return body_type;
		
	}
	
	@RequestMapping("/getAllBody_type")
	public List<Body_type>getAll(){
	List<Body_type>list=body_typeService.getAllBody_type();
	 return	list;
	}
}
