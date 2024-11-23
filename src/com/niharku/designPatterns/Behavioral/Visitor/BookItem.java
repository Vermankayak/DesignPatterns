package com.niharku.designPatterns.Behavioral.Visitor;

public class BookItem implements Item{
	
	String name;
	Integer price;
	
	public BookItem(String name, Integer price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}
	
	@Override
	public void accept(IVisitor visitor){
		visitor.visit(this);
	}

}
