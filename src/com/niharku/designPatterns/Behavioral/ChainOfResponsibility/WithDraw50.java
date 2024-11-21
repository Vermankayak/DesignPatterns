package com.niharku.designPatterns.Behavioral.ChainOfResponsibility;

public class WithDraw50 implements IWithDrawChain {
	
	IWithDrawChain nextChain;
	Integer amount;
	

	@Override
	public void setNextChain(IWithDrawChain withDrawChain) {
		this.nextChain = withDrawChain;
		

	}

	@Override
	public void withDrawAmount(Integer amount) {
		
		Integer numberOf50Denominations = amount/50;
		Integer remainder = amount % 50;
		
		if(remainder != 0) {
			
			this.nextChain.withDrawAmount(remainder);
			
		}
		
		System.out.println("Total Number of 50 Denominations :: " + numberOf50Denominations);
		

	}

}
