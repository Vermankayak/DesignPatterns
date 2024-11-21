package com.niharku.designPatterns.Behavioral.ChainOfResponsibility;

public class WithDraw20 implements IWithDrawChain {


	IWithDrawChain nextChain;
	Integer amount;
	

	@Override
	public void setNextChain(IWithDrawChain withDrawChain) {
		this.nextChain = withDrawChain;
		

	}

	@Override
	public void withDrawAmount(Integer amount) {
		
		Integer numberOf20Denominations = amount/20;
		Integer remainder = amount % 20;
		
		if(remainder != 0) {
			
			this.nextChain.withDrawAmount(remainder);
			
		}
		
		System.out.println("Total Number of 20 Denominations :: " + numberOf20Denominations);
		

	}


}
