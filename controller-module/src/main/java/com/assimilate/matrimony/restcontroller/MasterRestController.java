package com.assimilate.matrimony.restcontroller;

import static common.MatrimonyConstants.ALL_MASTERDEGREE;
import static common.MatrimonyConstants.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.MasterDegree;
import com.assimilate.matrimony.service.Master_degreeService;

@RestController
@RequestMapping(API)
public class MasterRestController {

	@Autowired
	private Master_degreeService master_degreeService;

	// @GetMapping("/api/masterDegree/masterdegrees")
	@GetMapping(ALL_MASTERDEGREE)
	public List<MasterDegree> masterdegrees() {
		List<MasterDegree> degrees = master_degreeService.getAllMasterDegree();
		return degrees;

	}
}
