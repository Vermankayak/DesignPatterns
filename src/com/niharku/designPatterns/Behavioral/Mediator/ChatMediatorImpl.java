package com.niharku.designPatterns.Behavioral.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements IChatMediator {
	
	List<ColleagueAbstractClass> lcac;
	
	public ChatMediatorImpl() {
		this.lcac = new ArrayList<ColleagueAbstractClass>();
	}
	
	
	public void addColleague(ColleagueAbstractClass cac) {
		lcac.add(cac);
	}
	
	

	@Override
	public void sendMessage(String msg, ColleagueAbstractClass cac) {
		
		System.out.println(cac.name + " sent the message");
		
		for(ColleagueAbstractClass ucac : lcac) {
			if(ucac != cac) {
				ucac.recieve(msg);
			}
		}
		
	}

}
