package com.niharku.designPatterns.Behavioral.Visitor;


public class Visitor implements IVisitor{
	
	Integer totalCost = 0;
	
	@Override
	public void visit(BookItem book) {
		totalCost += book.getPrice();
		
	}

	@Override
	public void visit(FruitItem fruit) {
		totalCost += fruit.getPrice();
	}

	

	public Integer calculateTotalPrice(){
		
		return totalCost;
		
	}
}
