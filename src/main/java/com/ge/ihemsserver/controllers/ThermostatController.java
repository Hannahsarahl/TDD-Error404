package com.ge.ihemsserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ge.ihemsserver.models.TempRange;
import com.ge.ihemsserver.models.Thermostat;
import com.ge.ihemsserver.models.ThermostatState;

@RestController
@RequestMapping("api/")
class ThermostatController {
	@Autowired
	private Thermostat thermostat;

	@GetMapping("/thermostat-state")
	ThermostatState getThermostatState() {
		return new ThermostatState(true, false, true, 30, new TempRange(20, 25));
	}

	@PutMapping("/desired-range")
	@ResponseBody
	ThermostatState setDesiredRange(@RequestBody TempRange desiredRange) {
		// TODO set range
		return new ThermostatState(false, true, true, 35, desiredRange);
	}
}
