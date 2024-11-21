package com.niharku.designPatterns.Behavioral.Mediator;

public interface IChatMediator {
	
	public void sendMessage(String msg, ColleagueAbstractClass cac);
	public void addColleague(ColleagueAbstractClass cac);

}
