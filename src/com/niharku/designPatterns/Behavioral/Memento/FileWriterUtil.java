package com.niharku.designPatterns.Behavioral.Memento;

public class FileWriterUtil {
	
	String fileName;
	StringBuilder content;
	
	public FileWriterUtil(String fileName) {
		this.fileName = fileName;
		this.content = new StringBuilder();
	}
	
	public void write(String s){
		
		this.content.append(s);
		
	}
	
	public Memento save(){
		return new Memento(this.fileName, this.content);
	}
	
	public void undo(Object obj){
		
		Memento m = (Memento) obj;
		this.fileName = m.fileName;
		this.content = m.content;
		
	}
	
	public String toString(){
		return this.content.toString();
	}
	
	private class Memento{
		
		private String fileName;
		private StringBuilder content;
		
		private Memento(String fileName, StringBuilder content) {
			this.fileName = fileName;
			this.content = new StringBuilder(content);
		}
	}

}
