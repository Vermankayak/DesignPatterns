package com.niharku.designPatterns.Structural.Bridge;

public class BlackDrawingPen implements IDrawingPen{

	@Override
	public void draw() {
		
		System.out.println("Drawing with a black Pen");
		
	}

}
