package com.niharku.designPatterns.Behavioral.Interpreter;

public class HexExpression implements Expression{

	@Override
	public void interpret(IInterpreter context, Integer i) {
		
		context.convertDecimalToHex(i);
		
	}

}
