package com.assimilate.matrimony.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.BacholerDegreeEntity;
import com.assimilate.matrimony.domain.UserEntity;
import com.assimilate.matrimony.service.BacholerDegreeService;
import com.assimilate.matrimony.service.UserService;

@RestController
public class BacholerDegreeController {
	
	@Autowired
	private BacholerDegreeService bacholerDegreeService;
	
	@GetMapping("/api/BacholerDegree/getallBacholerDegree")
	public List<BacholerDegreeEntity> getBacholerDegree(){
		
		return bacholerDegreeService.getBacholerDegree();
		
	}

}
