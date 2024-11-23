package com.niharku.designPatterns.Behavioral.Command;

public class Invoker {
	
	ICommand command;
	
	public Invoker(ICommand command) {
		this.command = command;
	}
	
	public void execute() {
		this.command.execute();
	}

}
