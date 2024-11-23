package com.niharku.designPatterns.Behavioral.Visitor;

public interface IVisitor {
	
	void visit(BookItem book);
	
	
	void visit(FruitItem fruit);

}
