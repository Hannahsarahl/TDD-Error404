package com.ge.ihemsserver.models;


import java.util.Observable;
import java.util.Observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Thermostat implements Observer
{
	private Furnace furnace;

	private TemperatureSensor temperatureSensor;


	@Autowired
    Thermostat(TemperatureSensor temperatureSensor, Furnace furnace)
	{
		this.furnace = furnace;
		this.temperatureSensor = temperatureSensor;
		
		temperatureSensor.addObserver(this);
	}

	public void update(Observable arg0, Object arg1)
	{
	}

}