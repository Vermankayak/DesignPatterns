package com.niharku.designPatterns.Behavioral.Interpreter;

public class BinaryExpression implements Expression {

	@Override
	public void interpret(IInterpreter context, Integer i) {
		
		context.convertDecimalToBinary(i);
		
	}

}
