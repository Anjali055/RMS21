package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Complexion;
import com.assimilate.matrimony.service.ComplexionService;

@RestController
@RequestMapping("api/Complexion")
public class ComplexionController {

	@Autowired 
	ComplexionService complexionService;
	
	@RequestMapping(path = "/createComplexion")
	public Complexion createComplexion(@RequestBody Complexion complexion) {
		complexionService.createComplexion(complexion);
		return complexion;
	}
	
	@RequestMapping("/getAllComplexion")
	public List<Complexion>getAll(){
	List<Complexion>list=complexionService.getAllComplexion();
	return	list;
	}
}
