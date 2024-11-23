package com.niharku.designPatterns.Behavioral.Iterator;

public interface IStudentCollection {
	
	void add(Student s);
	
	void remove(Student s);
	
	StudentIterator iterator();

}
