package com.niharku.designPatterns.Structural.Adapter;

public interface ISocketAdapter {
	
	Volt get120Volts();
	
	Volt get3Volts();
	
	Volt get12Volts();
}
