package com.niharku.designPatterns.Behavioral.Mediator;

public abstract class ColleagueAbstractClass {
	
	IChatMediator icm;
	
	String name;
	
	public ColleagueAbstractClass(IChatMediator icm, String name) {
		this.icm = icm;
		this.name = name;
	}
	
	public abstract void send(String msg);
	
	public abstract void recieve(String msg);

}
