package com.niharku.designPatterns.Behavioral.TemplateMethod;

public class WoodenHouse extends HouseTemplate{

	@Override
	public void buildPillars() {
		System.out.println("Built pillars using Wood");
		
	}

	@Override
	public void buildWalls() {
		System.out.println("Built Walls using Wood");
		
	}

}
