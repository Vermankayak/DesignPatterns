package com.niharku.designPatterns.Structural.Bridge;

public class Circle extends AbstractionShape{
	
	private Integer radius;

	public Circle(IDrawingPen drawingPen, Integer radius) {
		super(drawingPen);
		this.radius = radius;
		
	}

	@Override
	public void drawShapes() {
		
		System.out.print("Drawing circle with radius " + this.radius + " :: ");
		
		this.drawingPen.draw();
		
	}
	
	

}
