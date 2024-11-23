package com.niharku.designPatterns.Behavioral.State;

public class Context implements State{
	
	State st;
	
	public Context(State st) {
		this.st = st;
	}

	@Override
	public void doAction() {
		
		this.st.doAction();
		
	}

}
