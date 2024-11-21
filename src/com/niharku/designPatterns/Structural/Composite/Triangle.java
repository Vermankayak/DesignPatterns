package com.niharku.designPatterns.Structural.Composite;

public class Triangle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing Triangle using color:: "+ color);
	}

}
