package com.niharku.designPatterns.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject{
	
	List<Observer> observers;
	String name;
	Boolean changed = false;
	final static Object MUTEX = new Object();
	String msg;
	
	public MyTopic(String name) {
		this.name = name;
	}

	@Override
	public void register(Observer obs) {
		
		if(observers == null) {
			observers = new ArrayList<Observer>();
		}
		
		synchronized(MUTEX) {
			
			if(obs != null && !observers.contains(obs)) {
				observers.add(obs);
			}
			
		}
		
	}

	@Override
	public void unregister(Observer obs) {
		
		if(observers == null) {
			observers = new ArrayList<Observer>();
		}
		
		synchronized(MUTEX) {
			
			if(obs != null && !observers.contains(obs)) {
				observers.remove(obs);
			}
			
		}
		
	}

	@Override
	public String getUpdate(Observer obs) {
		
		return this.msg;
		
	}

	@Override
	public void notifyAllObservers() {
		
		List<Observer> obsCopy = null;
		
		synchronized(MUTEX) {
			
			if(!changed) {
				return;
			}
			
			obsCopy = new ArrayList<>(this.observers);
			this.changed = false;
			
		}
		
		for (Observer obs : obsCopy) {
			obs.update();
		}
		
		
	}
	
	public void postMessage(String msg) {
		
		this.msg = msg;
		this.changed = true;
		notifyAllObservers();
	}

}
