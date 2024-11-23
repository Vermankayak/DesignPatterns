package com.niharku.designPatterns.Behavioral.State;

public class TVOFFState implements State{
	@Override
	public void doAction() {
		System.out.println("TV is turned OFF!");
		
	}
}
