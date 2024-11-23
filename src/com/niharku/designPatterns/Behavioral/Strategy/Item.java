package com.niharku.designPatterns.Behavioral.Strategy;

public class Item {
	
	private String skuId;
	private int price;
	
	
	public Item(String skuId, int price) {
		this.skuId = skuId;
		this.price = price;
	}
	
	
	public int getPrice(){
		return price;
	}
	
	

}
