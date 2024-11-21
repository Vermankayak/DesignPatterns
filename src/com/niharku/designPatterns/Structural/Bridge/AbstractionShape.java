package com.niharku.designPatterns.Structural.Bridge;

public abstract class AbstractionShape {
	
	IDrawingPen drawingPen;
	
	public AbstractionShape(IDrawingPen drawingPen){
		
		this.drawingPen = drawingPen;
		
	}
	
	public abstract void drawShapes();

}
