package com.ge.ihemsserver.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ge.ihemsserver.models.SimulatorState;
import com.ge.ihemsserver.models.TempRange;
import com.ge.ihemsserver.models.TemperatureSensor;
import com.ge.ihemsserver.models.Thermostat;
import com.ge.ihemsserver.models.ThermostatState;

@RestController
@RequestMapping("api/sim/")
class SimulatorController {
	@Autowired
	private TemperatureSensor temperatureSensor;

	@Autowired
	private Thermostat thermostat;

	@PutMapping("/simulator-state")
	@ResponseBody
	ThermostatState setSimulatorState(@RequestBody SimulatorState simulatorState) {
		// TODO set state
		return new ThermostatState(true, false, simulatorState.isHomeOccupied(), simulatorState.getActualTemperature(), new TempRange(21, 26));
	}

}
