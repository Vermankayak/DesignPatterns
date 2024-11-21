package com.niharku.designPatterns.Behavioral.ChainOfResponsibility;

public class WithDraw10 implements IWithDrawChain {


	IWithDrawChain nextChain;
	Integer amount;
	

	@Override
	public void setNextChain(IWithDrawChain withDrawChain) {
		this.nextChain = withDrawChain;
		

	}

	@Override
	public void withDrawAmount(Integer amount) {
		
		Integer numberOf10Denominations = amount/10;
		Integer remainder = amount % 10;
		
		if(remainder != 0) {
			
			this.nextChain.withDrawAmount(remainder);
			
		}
		
		System.out.println("Total Number of 10 Denominations :: " + numberOf10Denominations);
		

	}


}
