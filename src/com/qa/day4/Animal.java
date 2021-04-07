package com.qa.day4;

public class Animal {
	
	//Instant Variables
	private String animalName;
	protected int size;
	private boolean hungry;
	
	//Getters and Setters
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String name) {
		this.animalName = name;
		
	}
	
	public int getSize() {
		return size;
	}
	public void setColour(int size) {
		this.size = size;
	}
	
	public boolean isHungry() {
		return hungry;
	}
	public void setIsHungry(boolean hungry) {
		this.hungry = hungry;
	}

	
	//Constructor
	public Animal(String name, int size, boolean hungry) {
		this.animalName = name;
		this.size = size;
		this.hungry = hungry;
	}

	
	//Methods
	public void eat() {
		System.out.println("The animal is eating.");
	}
	
	public void makingSound() {
		System.out.println("The animal is making a sound!");
	}
	
	

}
