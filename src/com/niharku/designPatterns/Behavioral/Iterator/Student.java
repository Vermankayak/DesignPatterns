package com.niharku.designPatterns.Behavioral.Iterator;

public class Student {
	
	String name;
	Integer age;
	
	public Student(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}

}
