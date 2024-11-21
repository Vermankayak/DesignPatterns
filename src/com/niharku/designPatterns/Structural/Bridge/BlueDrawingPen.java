package com.niharku.designPatterns.Structural.Bridge;


public class BlueDrawingPen implements IDrawingPen{

	@Override
	public void draw() {
		
		System.out.println("Drawing with a blue Pen");
		
	}

}

