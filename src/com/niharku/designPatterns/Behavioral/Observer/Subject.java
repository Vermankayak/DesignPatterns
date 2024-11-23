package com.niharku.designPatterns.Behavioral.Observer;

public interface Subject {
	
	
	void register(Observer obs);
	void unregister(Observer obs);
	String getUpdate(Observer obs);
	void notifyAllObservers();

}
