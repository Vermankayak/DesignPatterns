package com.niharku.designPatterns.Behavioral.Mediator;

public class ColleagueImpl extends ColleagueAbstractClass{

	public ColleagueImpl(IChatMediator icm, String name) {
		super(icm, name);
	}

	@Override
	public void send(String msg) {
		
		icm.sendMessage(msg, this);
		
	}

	@Override
	public void recieve(String msg) {
		
		System.out.println(this.name + " received message!");
		
	}

}
