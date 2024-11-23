package com.niharku.designPatterns.Behavioral.Memento;

public class CareTaker {
	
	public Object obj;
	
	public void save(FileWriterUtil fwu){
		 this.obj = fwu.save();
	}
	
	public void undo(FileWriterUtil fwu){
		fwu.undo(obj);
	}

}
