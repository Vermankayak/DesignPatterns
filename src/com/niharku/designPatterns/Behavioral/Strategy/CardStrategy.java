package com.niharku.designPatterns.Behavioral.Strategy;

public class CardStrategy implements PaymentStrategy{
	
	private String name;
	private String cardNo;
	private String expiryDate;
	private String cvv;
	
	
	public CardStrategy(String name, String cardNo, String expiryDate, String cvv) {
		this.name = name;
		this.cardNo = cardNo;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
	}
	

	@Override
	public void pay(Integer amount) {
		
		System.out.println("Payment of Rs "+ amount + " done with Credit Card  XXXXXXX" + this.cardNo.substring(this.cardNo.length() - 5, this.cardNo.length()));
		
		
	}
	
	

}
