package com.qa.day4;

public class Monkey extends Animal {
	
	private String colour;
	
	
	
	public Monkey(String name, int size, boolean hungry) {
		super(name, size, hungry);
		
	}
	
	
	public void isClimbing() {
		System.out.println("The monkey is climbing the tree!");
	}
	
	
	@Override
	public void eat() {
		System.out.println("The monkey is eating a banana.");
	}
	

	

}
