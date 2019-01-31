package com.ge.ihemsserver.controllers;

import static org.springframework.http.MediaType.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ge.ihemsserver.models.TemperatureSensor;
import com.ge.ihemsserver.models.Thermostat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class SimulatorControllerTests {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private Thermostat thermostat;
	@MockBean
	private TemperatureSensor temperatureSensor;

	@Test
	void testSetSimulatorState() throws Exception {

		// setup mocks
		
		ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.put("/api/sim/simulator-state")
				.contentType(APPLICATION_JSON_VALUE).content("{\"actualTemperature\":1,\"homeOccupied\":true}"));


		// Verify behavior
	}
}
