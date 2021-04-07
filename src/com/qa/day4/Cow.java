package com.qa.day4;

public class Cow extends Animal{
	
	private int colour;
	private boolean hasFourLegs;
	private int weight;

	
	public Cow(String name, int size, boolean hungry) {
		super(name, size, hungry);
		
	}
	

	
	@Override
	public void eat() {
		System.out.println("The cow is eating grass.");
	}
	
	@Override
	public void makingSound() {
		System.out.println("The cow is going mooooo!");
	}
	
	

}
