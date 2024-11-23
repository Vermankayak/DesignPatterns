package com.niharku.designPatterns.Behavioral.Interpreter;

public interface Expression {
	
	void interpret(IInterpreter context, Integer i);

}
