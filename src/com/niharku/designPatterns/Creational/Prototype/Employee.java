package com.niharku.designPatterns.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private List<String> empList;
	
	public Employee() {
		empList = new ArrayList<String>();
	}
	
	public Employee(List<String>  list) {
		this.empList = list;
	}
	
	public List<String> getEmpList(){
		return empList;
	}
	
	public void loadData() {
		empList.add("Nihar");
		empList.add("Rashika");
		empList.add("Kuldeep");
		empList.add("Suneeta");
	}
	
	public Employee clone() {
		
		List<String> tempList = new ArrayList<String>();
		
		for(String emp : this.getEmpList()) {
			tempList.add(emp);
		}
		
		return new Employee(tempList);
	}

}
