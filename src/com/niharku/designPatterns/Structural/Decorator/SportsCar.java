package com.niharku.designPatterns.Structural.Decorator;

public class SportsCar extends CarDecorator{

	public SportsCar(Car car) {
		super(car);
	}

	
	@Override
	public void assemble() {
		car.assemble();
		
		System.out.println("Adding components of Sports Car");
		
	}
}
