package com.niharku.designPatterns.Behavioral.Observer;

public class MySubscribers implements Observer{
	
	String name;
	
	Subject topic;
	
	public MySubscribers(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		String msg = this.topic.getUpdate(this);
		
		if(msg == null) {
			System.out.println("No message received");
			
		}else {
			System.out.println("Consumed message by " + this.name+ " :: " + msg);
		}
		
	}

	@Override
	public void setSubject(Subject obj) {
		
		this.topic = obj;
		
	}

}
