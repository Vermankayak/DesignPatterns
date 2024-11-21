package com.niharku.designPatterns.Behavioral.TemplateMethod;

public class GlassHouse extends HouseTemplate{

	@Override
	public void buildPillars() {
		System.out.println("Built pillars using Glass");
		
	}

	@Override
	public void buildWalls() {
		System.out.println("Built Walls using Glass");
		
	}

}