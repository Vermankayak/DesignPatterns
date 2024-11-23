package com.niharku.designPatterns.Behavioral.Strategy;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	
	List<Item> items;
	
	public Cart() {
		items = new ArrayList<Item>();
	}
	
	
	public void addItem(Item item){
		items.add(item);
	}
	
	
	public void removeItem(Item item){
		items.remove(item);
	}
	
	
	public int calculateCost(List<Item> items) {
		int cost = 0;
		
		for (Item item : items) {
			cost += item.getPrice();
		}
		return cost;
	}
	
	public void pay(PaymentStrategy paymentMethod) {
		
		
		int price = calculateCost(this.items);
		paymentMethod.pay(price);
		
		
	}
	
}
