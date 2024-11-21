package com.niharku.designPatterns.Structural.Composite;

public class Square implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing Square using color:: "+ color);
		
	}

}
