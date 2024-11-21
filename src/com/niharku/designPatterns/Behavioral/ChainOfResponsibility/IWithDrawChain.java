package com.niharku.designPatterns.Behavioral.ChainOfResponsibility;

public interface IWithDrawChain {
	
	void setNextChain(IWithDrawChain withDrawChain);
	
	void withDrawAmount(Integer amount);

}
