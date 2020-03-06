package com.assimilate.matrimony.restcontroller;

import static common.MatrimonyConstants.ALL_BACHELOERDEGREES;
import static common.MatrimonyConstants.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.BacholerDegree;
import com.assimilate.matrimony.service.Bachloer_DegreeService;

@RestController
@RequestMapping(API)
public class BachloerRestController {

	@Autowired
	private Bachloer_DegreeService degreeService;

	// @GetMapping("/api/bacholerDegrees/bacholer_Degrees")
	@GetMapping(ALL_BACHELOERDEGREES)
	public List<BacholerDegree> bacholer_Degrees() {

		List<BacholerDegree> bdegrees = degreeService.getAllBachloerDegree();
		return bdegrees;

	}
}
