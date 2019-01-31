package com.ge.ihemsserver.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.ge.ihemsserver.models.TempRange;
import com.ge.ihemsserver.models.Thermostat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class ThermostatControllerTests {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private Thermostat thermostat;


	@Test
	void testSetDesiredRange() throws Exception {
		
		// setup mock(s)
		
		ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.put("/api/desired-range")
				.contentType(APPLICATION_JSON_VALUE).content("{\"min\":15,\"max\":25}"));
		
		// verify
	}

	@Test
	void testGetThermostatState() throws Exception {
		
		// setup mock(s)
		
		ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/api/thermostat-state"));

		// verify
	}

}
