package com.assimilate.matrimony.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.matrimony.domain.State;
import com.assimilate.matrimony.service.StateService;

import static com.assimilate.matrimony.constants.ControllerConstants.*;

@RestController
@RequestMapping(ROOT_API_STATE)
public class StateController {

	@Autowired
	StateService stateservice;

	@PostMapping(SAVE_STATE)
	public State saveState(@RequestBody State state) {
		return stateservice.saveState(state);

	}

}