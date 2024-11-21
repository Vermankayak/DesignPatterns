package com.niharku.designPatterns.Behavioral.TemplateMethod;

public abstract class HouseTemplate {
	
	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built");
	}
	
	public final void buildFoundation() {
		System.out.println("Built House foundation using Iron and cement");
	}
	
	public abstract void buildPillars();
	
	public abstract void buildWalls();	
	
	public final void buildWindows() {
		System.out.println("Built Windows using Glass");
	}

}
