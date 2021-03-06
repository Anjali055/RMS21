
package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.Complexion;
import com.assimilate.matrimony.domain.User;
import com.assimilate.matrimony.service.ComplexionService;
import com.assimilate.matrimony.service.UserService;

@RestController
@RequestMapping("api/complexion")
public class ComplexionController {
	
	private static final long serialVersionUID = 1L;
	
	
	@Autowired
	private ComplexionService complexionservice;
	
	
	
/*	@PostMapping("/createUser")
	public String CreateUser(@RequestBody Complexion complexion) {
		complexionservice.createComplexion(complexion);
		  return "user saved successfuly";
	}*/
	
	@GetMapping("/getAll")
	public List<Complexion> getAll(){
		return complexionservice.getComplexion();
	}

}
package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.ComplexionEntity;
import com.assimilate.matrimony.service.ComplexionService;

@RestController
@RequestMapping("api/Complexion")
public class ComplexionController {

	@Autowired 
	ComplexionService complexionService;
	
	@RequestMapping(path = "/createComplexion")
	public ComplexionEntity createComplexion(@RequestBody ComplexionEntity complexion) {
		complexionService.createComplexion(complexion);
		return complexion;
	}
	
	@RequestMapping("/getAllComplexion")
	public List<ComplexionEntity>getAll(){
	List<ComplexionEntity>list=complexionService.getAllComplexion();
	return	list;
	}
}
