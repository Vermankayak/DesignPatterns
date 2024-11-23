package com.niharku.designPatterns.Behavioral.Interpreter;

public class InterpreterContext implements IInterpreter{

	@Override
	public void convertDecimalToBinary(Integer i) {
		
		System.out.println(i.toBinaryString(i));
		
	}

	@Override
	public void convertDecimalToHex(Integer i) {
		System.out.println(i.toHexString(i));
		
	}
	
}
