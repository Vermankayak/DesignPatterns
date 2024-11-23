package com.niharku.designPatterns.Behavioral.Strategy;

public class PaypalStrategy implements PaymentStrategy{
	
	
	private String email;
	private String password;
	
	public PaypalStrategy(String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(Integer amount) {
		System.out.println("Payment of Rs "+ amount + " done with Paypal!");
		
	}

}
