package com.niharku.designPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Art implements Shape{
	
	List<Shape>shapes = new ArrayList<>();

	@Override
	public void draw(String color) {
		
		for (Shape sh:shapes) {
			sh.draw(color);
		}
		
	}
	
	public void addShapes(Shape sh) {
		this.shapes.add(sh);
		
		System.out.println("Added shape:: "+sh.getClass());
	}
	
	public void removeShapes(Shape sh) {
		this.shapes.remove(sh);
		System.out.println("Removed shape:: "+sh.getClass());
	}
	
	public void clearShapes() {
		this.shapes.clear();
		System.out.println("Cleared shapes list");
	}

}
